package exercise.chatper_54;

public class LambdaTest2 {

    public static void main(String[] args){
        MultipleNum multipleNum = num -> num * 1;

        StringNum stringNum2 = (str, num) -> {
            for(int i =0; i < num; i++){
                System.out.println("StringNum2 : " + str);
            }
        };
    }
}
