package day4.Assignment3.Question15;

import java.util.*;

public class ListExcludeMap {

    public static List<Integer> exclusion(List<Integer> list, Map<String, String> map){
        List<Integer> outputList = new ArrayList<>();

        for(Integer i : list){
            if(!map.containsValue(i.toString())){
                outputList.add(i);
            }
        }

        return outputList;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);

        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "10");

        List<Integer> resultList = exclusion(list, map);

        System.out.println(Arrays.toString(resultList.toArray()));



    }
}
