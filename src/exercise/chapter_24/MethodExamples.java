package exercise.chapter_24;

public class MethodExamples {

    static int toUnicode(char ch){
        return (int) ch;
    }

    static int sumAndMultiplyFour(int a, int b){
        return (a +b) * 4;
    }

    public static void main(String[] args){
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1,myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");

        printHi();

    }

    static String sayHello(){
        return "Hello";
    }

    static void printHello(String str){
        System.out.printf("함수안에서 실행합니다. %s\n", str);
    }

    static void printHi(){
        System.out.println("Hi");
    }

}
