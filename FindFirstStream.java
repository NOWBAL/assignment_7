package assignment_7;
import java.util.*;
import java.util.stream.*;
public class FindFirstStream {

        public static <T> T
        firstElementInStream(Stream<T> stream)
        {
            T first_element
                    = stream
                    .reduce((first, second) -> first)

                    .orElse(null);

            return first_element;
        }

        public static void main(String[] args)
        {

            Stream<String> stream
                    = Stream.of("Geek_First", "Geek_2",
                    "Geek_3", "Geek_4",
                    "Geek_Last");

            System.out.println(
                    "First Element: "
                            + firstElementInStream(stream));
        }
    }
