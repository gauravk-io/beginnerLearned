package beginner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
//        Declare array one-by-one
        char vowels[] = new char[5];

//        a,e,i,o,u

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        vowels[2] = 'x';        // index 2 is replaced by 'x'

        System.out.println(Arrays.toString(vowels));
//        Declare array in one line
        char consonant[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t',
                'v','w','x','y','z'};
        System.out.println(Arrays.toString(consonant));
    }
}


/*
Some methods of Array:


1. length: Returns the length of the array.

2. clone(): Creates a new array object that is a copy of the original array.

3. copyOf(): Creates a new array object that is a copy of the original array with a specified length.

4. copyOfRange(): Creates a new array object that is a copy of a specified range of elements from the
   original array.

5. equals(): Checks if two arrays are equal.

6. fill(): Assigns a specified value to each element of the array.

7. sort(): Sorts the elements of the array in ascending order.

8. binarySearch(): Searches for a specified element in the sorted array using binary search.

9. toString(): Converts the array to a string representation.

10. hashCode(): Returns the hash code for the array.

11. asList(): Converts an array to a fixed-size list.

12. stream(): Creates a sequential stream from the array elements.

13. parallelStream(): Creates a parallel stream from the array elements.

14. stream().toArray(): Converts the array to a stream and then collects it back to an array.

15. stream().anyMatch(): Checks if any element of the array matches a specified condition.

16. stream().allMatch(): Checks if all elements of the array match a specified condition.

17. stream().noneMatch(): Checks if no element of the array matches a specified condition.

18. stream().filter(): Creates a new stream with elements that satisfy a specified condition.

19. stream().map(): Transforms the elements of the array using a specified mapping function.

20. stream().reduce(): Performs a reduction operation on the elements of the array.

21. stream().forEach(): Applies an action to each element of the array.
 */

/*
    These are just some of the commonly used array methods in Java. There may be additional methods
    available depending on the specific type of array you are working with, such as int[], double[],
    or Object[].
 */