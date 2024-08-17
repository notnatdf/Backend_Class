package exercise.chapter_52;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args){

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.TURSDAY;

        System.out.println("ordinal 값 : " + monday.ordinal());
        System.out.println("ordinal 값 : " + sunday.ordinal());
        System.out.println("ordinal 값 : " + thursday.ordinal());

        System.out.println("CompareTo : " + monday.compareTo(sunday));
        System.out.println("CompareTo : " + monday.compareTo(thursday));

        Day[] days = Day.values();
        System.out.println("Days : " + Arrays.toString(days));

    }
}
