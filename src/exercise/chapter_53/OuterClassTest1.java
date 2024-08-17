package exercise.chapter_53;

public class OuterClassTest1 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(20);

        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);

        innerClass1.display();

        OuterStaticClass outerStaticClass = new OuterStaticClass(20);

        OuterStaticClass.InnerClass innerclass2 = new OuterStaticClass.InnerClass(10);
    }
}
