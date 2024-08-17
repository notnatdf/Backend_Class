package exercise.chapter_14;

public class Encoding {

    public static void main(String[] args){

        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int) ch1);

        int num = 66;
        System.out.println(num);
        System.out.println((char) num);

        char smallA = 'a';
        char largeA = 'A';

        boolean result = smallA > largeA;
        System.out.println(result);

        char hanguel = '\uAC00';
        System.out.println(hanguel);

        char special1 = '\t';
        System.out.println(special1);

        char special2 = '\n';
        System.out.println(special2);

        char special3 = '\'';
        System.out.println(special3);

        char special4 = '\"';
        System.out.println(special4);

    }
}
