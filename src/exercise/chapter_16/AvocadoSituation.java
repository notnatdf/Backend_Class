package exercise.chapter_16;

public class AvocadoSituation {

    public static void main(String[] args){
        int milks = 0;
        int avocados = 0;
        boolean existedAvocado = true;

        milks = 1;
        if(existedAvocado) {
            avocados = avocados + 6;

        }

        String comment = String.format("장보고 돌아왔어 &d 개 아보카도, %d개 우유 사왔어",avocados, milks);
        System.out.println(comment);
    }
}
