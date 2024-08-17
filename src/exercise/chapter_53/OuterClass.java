package exercise.chapter_53;

public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass{

        private int innerdata;

        public InnerClass(int innerdata) {
            this.innerdata = innerdata;
        }

        void display(){
            System.out.println("OuterData : " + outerData);
            System.out.println("InnerData : " + innerdata);
        }
    }
}
