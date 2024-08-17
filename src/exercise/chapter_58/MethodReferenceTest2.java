package exercise.chapter_58;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {

    public static void main(String[] args){

        Customer customer1 = new Customer("문재인");
        Customer customer2 = new Customer("안철수");

        Supplier<String> ex1 = customer1::toString;
        Supplier<String> ex2 = customer2::toString;

        System.out.println(ex1.get());
        System.out.println(ex2.get());

        List<Customer> customerList = Arrays.asList(
                new Customer("홍준표"),
                new Customer("박지원"),
                new Customer("이재명"),
                new Customer("조국")
        );

        customerList.forEach(Customer::printMyInfo);
    }
}
