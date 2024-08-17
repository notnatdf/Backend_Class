package exercise.chapter_53;

public class OuterStaticClass {

    private static int outerData;

    public OuterStaticClass(int outerData) {
//        this.outerData = outerData;
    }

    public static class InnerClass {
        private int innerData;


        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display() {
            System.out.println("OuterData : " + outerData);
            System.out.println("InnerData : " + innerData);
        }
    }
}
