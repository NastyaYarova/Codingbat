package main.java;

import java.util.HashMap;
import java.util.Map;

public class MapBully {


    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a")) {

            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }

    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");

        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "coconut");
        MapBully mapBully = new MapBully();
        mapBully.mapBully(map);
        System.out.println(map);

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("a", "apple");
        map2.put("b", "banana");
        map2.put("c", "coconut");
        MapBully mapShare = new MapBully();
        mapShare.mapShare(map2);
        System.out.println(map2);

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("a", "apple");
        map3.put("b", "banana");
        map3.put("c", "coconut");
        MapBully mapAB = new MapBully();
        mapAB.mapAB(map3);
        System.out.println(map3);

        Map<String, String> map4 = new HashMap<>();
        map4.put("ice cream","peanuts");
        map4.put("","");
        map4.put("pancake", "syrup");
        MapBully topping1 = new MapBully();
        topping1.topping1(map4);
        System.out.println(map4);
    }
}
