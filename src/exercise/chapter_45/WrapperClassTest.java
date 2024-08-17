package exercise.chapter_45;

public class WrapperClassTest {
    public static void main(String [] args){
        Integer integer1 = new Integer(20);
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue();
        int int2 = integer2.intValue();

        Integer integer3 = 20;
        int int3 = integer3;

//        System.out.println(integer1);
//        System.out.println(int1);
//        System.out.println(integer3);
//
//        System.out.println(integer1 + integer2);
//        System.out.println(integer1 + int1);

        Character character = new Character('X');
        char ch1 = character.charValue();

        System.out.println(ch1);
        System.out.println(character);

        Character [] characters = {'a','b','c'};
        char [] chars = {'a','b','c'};

        String str = String.valueOf(characters);
        String str1 = String.valueOf(chars);

        System.out.println(str);
        System.out.println(str1);

        Boolean boolean1 = new Boolean(true);
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2);
        System.out.println(boolean1 | boolean2);

    }
}
