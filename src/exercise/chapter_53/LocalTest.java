package exercise.chapter_53;

public class LocalTest {
    public static void main(String[] args){

        class LocalWalk implements Walkable{

            @Override
            public void walk() {
                System.out.println("LoclaWalk : Walking");
            }
        }
        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        Walkable annonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println("AnnonymousWalk : Walking");
            }
        };
        annonymousWalk.walk();
    }
}
