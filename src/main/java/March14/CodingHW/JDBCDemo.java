package March14.CodingHW;

import March14.CodingHW.util.JDBCInit;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        JDBCInit jdbcInit = new JDBCInit();
        Connection connection = jdbcInit.Initialization();
        PreparedStatement preparedStatement = null;

        //Create table
        Statement statement = connection.createStatement();
        String personTable = "CREATE TABLE person(" +
                "person_id INT NOT NULL AUTO_INCREMENT," +
                "    firstname VARCHAR(50) NOT NULL," +
                "    lastname VARCHAR(50) NOT NULL," +
                "    PRIMARY KEY (person_id)" +
                ")";
        statement.executeUpdate(personTable);

        //Insert some tuples
        String insertion = "INSERT INTO person (firstname, lastname) VALUES (?, ?)";
        preparedStatement = connection.prepareStatement(insertion);
        connection.setAutoCommit(false);
        for(int i = 1; i < 11; i++){
            preparedStatement.setString(1, "Firstname" + i);
            preparedStatement.setString(2, "Lastname" + i);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        connection.commit();

        //Read from tables
        String select = "SELECT * FROM person";
        ResultSet rs = connection.prepareStatement(select).executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt("person_id") + " | " + rs.getString("firstname") + " | " + rs.getString("lastname"));
        }

        //Update from tables
        String update = "UPDATE person SET firstname = ? WHERE person_id = ?";
        preparedStatement = connection.prepareStatement(update);
        preparedStatement.setString(1, "Updatename");
        preparedStatement.setInt(2, 1);
        int rowAffect = preparedStatement.executeUpdate();
        System.out.println("Num of updated row: " + rowAffect);


        // Delete from tables
        String delete = "DELETE FROM person WHERE person_id = ?";
        preparedStatement = connection.prepareStatement(delete);
        for(int i = 1; i < 5; i++){
            preparedStatement.setInt(1, i);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
    }
}
