package exercise;

public class Operator2 {

    public static void main(String[] args){

        String num1 = "abc";
        String num2 = "abc";

        boolean result = num1 == num2;
//        System.out.println(result);

        boolean condition1 = 5 < 3;
        boolean condition2 = 4 >= 4;

        boolean result2 = !(condition1 || condition2);
        System.out.println(result2);
    }
}
