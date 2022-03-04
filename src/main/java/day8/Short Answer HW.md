# Short Answer HW

1. **View vs Stored Procedure**
    - A view represents a virtual table. We can join multiple tables in a vie wand use the view to present the data as if the data were coming from a single table.
    - A stored procedure uses parameters to do a function whether it is updating and inserting data, or returning single values or data sets.
    - View vs Stored procedure
        
        
        | View | Stored Procedure |
        | --- | --- |
        | Does NOT accept parameters | Accept parameters |
        | Can be used as building block in a larger query | Can NOT be used as building block in a larger query |
        | Can contain only one single SELECT query | Can contain several statements, loops, IF ELSE, etc. |
        | Can NOT perform modifications to any table | Can perform modifications to one or several tables |
        | Can (sometimes) be sued as the target of an INSERT, UPDATE  or DELETE statement. | Can NOT be used as the target of an INSERT, UPDATE or DELETE statement. |
2. **View vs Material View**
    - View
    A view represents a virtual table. We can join multiple tables in a vie wand use the view to present the data as if the data were coming from a single table.
    - Materialized View 
    Materialized View is the Physical copy of the original base tables. The Materialized View is like a picture of the original base tables. U
    - View vs Materialized View
        - Unlike View, the Materialized View are precomputed and stored on a disk like an object, and they are not updated each time they are used. Instead, the materialized view has to be updated manually or with the help of triggers. The process of updating the Materialized View is called Materialized View Maintenance.
        - Materialized View responds faster than the View. It is because the materialized view is precomputed and hence, it does not waste time in resolving the query or joins in the query that creates the Materialized View. Which in turn responses faster to the query made on materialized view.
        - Materialized View utilizes the memory space as it stored on the disk whereas, the View is just a display hence it do not require memory space.
3. B Tree vs B+ Tree
    - B Tree
    B Tree is a self-balancing tree, its nodes are sorted in the inorder traversal. In B tree, a node can have more than two children. B tree ahs a height of logM N (Where M is the order  of three and N is the number of nodes). And the height is adjusted automatically at each update. IN the B tree data is sorted in a specific order, with the lowest value on the left and the highest value on the right. To insert the data or key in B tree is more complicated than a binary tree.
        - Invariant of B tree
            - All the leaf nodes of the B tree must be at the same level.
            - Above the leaf nodes of the B tree, there should be no empty sub-trees.
            - B tree’s height should lie as low as possible.
    - B+ Tree
    B+ Tree eliminates the drawback B tree used for indexing by storing data pointers only at the leaf nodes of the tree. Thus, the structure of leaf nodes of a B+ tree is very different from the structure of internal nodes of the B tree. In B+ tree, records can only be stored on the leaf nodes while internal nodes can only store the key values. The leaf nodes of a B+ tree are linked together in the form of a singly linked lists to make the search queries efficient. B+ tree are used to store the large amount of data which cannot be stored in the main memory. Due to the fact that, size of main memory is always limited, the internal nodes (keys to access records) of the B+ tree are stored in the main memory whereas, leaf nodes are stored in the secondary memory.
    - B Tree vs B+ Tree
        
        
        | B Tree | B+ Tree |
        | --- | --- |
        | Search keys cannot be repeatedly stored. | Redundant search keys can be present. |
        | Data can be stored in leaf nodes as well as internal nodes. | Data can only be stored on the leaf nodes. |
        | Searching for some data is a lower process since data can be found on internal nodes as well as on the leaf nodes. | Searching is comparatively faster as data can only be found on the leaf nodes. |
        | Deletion of internal nodes are so complicated and time consuming. | Deletion will never be a complexed process since element will always be deleted from the leaf nodes. |
        | Leaf nodes can not be linked together | Leaf nodes are linked together to make the search operations more efficient. |