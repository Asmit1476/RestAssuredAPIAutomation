package JavaConcepts.MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customer = EkartDataBase.getAll();

        //Map -> One to One mapping
        customer.stream().map(cus->cus.getEmail()).collect(Collectors.toList()).forEach(System.out::println);

        //Map -> One to many mapping
        List<List<String>> phoneNumbers = customer.stream().map(cust->cust.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("Phone Numbers using Map->"+phoneNumbers);

        //FlatMap -> One to Many
        customer.stream().flatMap(cust->cust.getPhoneNumbers().stream()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
