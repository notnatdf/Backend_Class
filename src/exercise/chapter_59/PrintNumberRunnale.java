package exercise.chapter_59;

public class PrintNumberRunnale implements Runnable {
    int start;
    int end;

    public PrintNumberRunnale(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++){
            System.out.print( i + "");
        }
    }
}
