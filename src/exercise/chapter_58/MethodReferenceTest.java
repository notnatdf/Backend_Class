package exercise.chapter_58;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public static void main(String[] args){

        Consumer<String> ex1 = Printer::printSomething;
        Consumer<String> ex2 = (str) -> Printer.printSomething(str);

        ex1.accept("methodrefren 사용");
        ex2.accept("lambda 식 사용");

        Supplier<Customer> ex3 = () -> new Customer ();
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());
        System.out.println(ex4.get());

        Function<String, Customer> ex5 = (str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println("name 들어간 생성자 : " + ex5.apply("임영웅"));
        System.out.println("name 들어간 생성자 : " + ex6.apply("영탁"));
    }
}
