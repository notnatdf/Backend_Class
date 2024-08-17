package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args){
        System.out.println("메인메소드가 시작합니다.");

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("You");
        stringList.add("Cord");
        stringList.add(null);
        stringList.add("Good");

        for (int i = 0; i < stringList.size(); i++) {
            try {
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("Null은 안됨");
            }
        }
        System.out.println("메인메소드가 시작합니다.");
    }
}
