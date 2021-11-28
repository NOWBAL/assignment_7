package assignment_7;
import java.util.*;
public class CountInStream {

        public static void main(String[] args)
        {
            List<Integer> list = Arrays.asList(0, 2, 4, 6,
                    8, 10, 12);
            long total = list.stream().count();

            System.out.println(total);
        }
    }

