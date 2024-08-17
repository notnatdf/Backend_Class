package exercise.chapter_17;

public class Taxi {

    public static void main(String[] args){

        int goHomeTime = 7;
        String myHome = "기흥";
        int payment = 10_000;

        if(0 < goHomeTime && goHomeTime < 4){
            payment = payment + (int) (payment * 0.2);
        }
        if (myHome != "서울" ) {
            payment = payment +(int) (payment * 0.2);
        }
        String result = String.format("고객님이 지불하셔야 할 돈은 %d 입니다.",payment);
        System.out.println(result);
    }
}
