package exercise.chapter_25;

public class Fish {

    String sex;
    boolean havingPoison;
    String StarSpawingDate;
    String EndSpawingDate;
    String livingSea;

    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }

    void swim(int meter){
            System.out.println("나는 헤엄칩니다 미터:" + meter);
    }

    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    void sleep (){};

}

