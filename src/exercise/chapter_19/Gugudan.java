package exercise.chapter_19;

public class Gugudan {
    public static void main(String[] args) {
        final int WAKE_UP_TIME = 8 * 60;
        final int END_DAY = 24 * 60;

        int now = WAKE_UP_TIME;
        System.out.println("공부 존나 싫어 30분부터");

        while (now < END_DAY) {
            now++;
            int hour = now / 60;

            if (now % 60 == 0){

                System.out.printf("씨발 좆같다 %d정각\n", hour);
            }
            if (hour == 10) {
                break;
            }

            if (now % 60 == 34) {
                System.out.println("34분 좆됐다");
                System.out.println("씨발 정각에 하자");
            }
            if (now % 60 == 8) {
                System.out.println("니미 8분 좆됐다");
                System.out.println("공부 좆나 싫어 30분부터");
            }


        }
    }
}


