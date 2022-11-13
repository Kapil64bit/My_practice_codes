package comparableAndComparator;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<students> s= new ArrayList<>();
        s.add(new students(23,"Ram"));
        s.add(new students(72,"Kapil"));
        s.add(new students(27,"Kapil"));
        s.add(new students(72,"ramu"));
        s.add(new students(72,"raman"));
        s.add(new students(72,"radhe"));

        Collections.sort(s,Comparator.comparing(students::getName ).thenComparing(students::getMarks).reversed());


        s.forEach(System.out::println);

    }
}
class ifNameThanMarks implements Comparator<students>{


    @Override
    public int compare(students o1, students o2) {
        if(o1.name.equals(o2.name)){
            return o1.marks - o2.marks;
        }
        else{
            return o2.name.compareTo(o1.name);
        }
    }

}
