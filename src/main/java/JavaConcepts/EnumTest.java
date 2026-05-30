package JavaConcepts;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Weeks{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumTest {
    public static void main(String[] args) {

        Set<Weeks> weeks = EnumSet.allOf(Weeks.class);
        System.out.println("Weeks are "+weeks);

        Iterator<Weeks> itr = weeks.iterator();
        while (itr.hasNext()){
            System.out.println("Weeks-> "+itr.next());
        }

        Set<Weeks> test = EnumSet.noneOf(Weeks.class);
        System.out.println("Result is "+test);

        Set<Weeks> result = EnumSet.of(Weeks.TUESDAY,Weeks.SUNDAY);
        System.out.println("Values: "+result);

        Set<Weeks> rangeOfValues = EnumSet.range(Weeks.TUESDAY,Weeks.SATURDAY);
        System.out.println("Range of Values: "+rangeOfValues);

        rangeOfValues.add(Weeks.SUNDAY);
        System.out.println("Latest Range of Values: "+rangeOfValues);

        rangeOfValues.remove(Weeks.TUESDAY);
        System.out.println("Latest Range of Values after removal: "+rangeOfValues);

    }
}


