package exercise.chatper_54;

import java.util.Optional;
import java.util.function.Supplier;

public class OptinalLambdaTests {

    public static void main(String[] args){
        String str = null;

        Optional<String> stringOptional = Optional.ofNullable(str);

//        Supplier<String> stringSupplier = () -> "default";

        String str2 = stringOptional.orElseThrow(() -> {throw  new CustomException("CustomException 임");})
                .toUpperCase();

        System.out.println(str2);
    }
}
