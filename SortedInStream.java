package assignment_7;
import java.util.*;
import java.util.stream.*;

    public class SortedInStream
    {
        public static void main(String[] args)
        {
//returns a list view
            List<Integer> slist = Arrays.asList(10,-4,30,5,39,-25);
            List<Integer> sortedList = slist.stream().sorted().collect(Collectors.toList());
            sortedList.forEach(System.out::println);
        }
    }

