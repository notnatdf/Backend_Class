package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {


    public static void main(String[] args){

        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Orange",5);
        fruitMap.put("Apple",5);
        fruitMap.put("Banana",5);
        fruitMap.put("Kiwi",5);

        System.out.println("fruitMap : " + fruitMap);

        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("사과 갯수 " + appleCount);
        System.out.println("바나나 갯수 " + bananaCount);

        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("Apple 있는지 : " + isApple);
        System.out.println("Mango 있는지 : " + isMango);

        fruitMap.remove("Apple");
        System.out.println("fruitMap : " + fruitMap);

        System.out.println("fruitMap 사이즈 : " + fruitMap.size());

        System.out.println(fruitMap.keySet());



    }
}
