package JavaConcepts.MapAndFlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101,"John","john@gmail.com", Arrays.asList("8934567891","9834567009")),
                new Customer(102,"Akash","akash@gmail.com", Arrays.asList("8934567000","9834117009")),
                new Customer(103,"Abhinav","abhinav@gmail.com", Arrays.asList("8734567891","9734567009")),
                new Customer(104,"Ravi","ravi@gmail.com", Arrays.asList("8034567891","9034567009"))
        ).collect(Collectors.toList());
    }
}
