package exercise.chapter_44;

public class StringEqualsTest {
    public static void main(String[] args){
        String str1 = "cat";
        String str2 = "cat";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("cat");
        String str4 = new String("cat");

        System.out.println(str3.equals(str4));
        System.out.println(str1 == str4);
    }
}
