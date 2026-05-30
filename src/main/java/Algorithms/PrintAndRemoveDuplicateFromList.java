package Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintAndRemoveDuplicateFromList {
    public static void main(String[] args) {

        //First Way

           List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(10);
            list.add(30);
            list.add(10);

        List<Integer> result = new ArrayList<>();

        for(int value:list){

            if(result.contains(value)){
                System.out.println("Duplicate Value is: "+value);

            }else {
                result.add(value);
            }
        }
        System.out.println("Result  is: "+result);

//2nd Way

        List<Integer> output = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Output is: "+output);

        //3rd Way
        Set<Integer> newSet = new HashSet<>(list);
        System.out.println("New Set is: "+newSet);




    }
}

