package exercise.chapter_58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이재명"));
        customers.add(new Customer("C001", "이준석"));
        customers.add(new Customer("C001", "송영길"));
        customers.add(new Customer("C001", "조국"));

        customers.stream().map(customer -> customer.name)
                .filter(StringUtils::isLongName)
//                .forEach(name -> System.out.println(name))
                .forEach(System.out::println);

        List<String> customerNames = Arrays.asList(
                "용혜인",
                "이수정",
                "오세훈",
                "배현진"
        );

        List<Customer> customerList = customerNames.stream().map(Customer::new).collect(Collectors.toList());

        System.out.println("cutomerList : " + customerList);
    }
}
