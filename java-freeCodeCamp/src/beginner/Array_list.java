package beginner;
import java.util.ArrayList;         // Import the ArrayList class

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();   // Create an ArrayList instance

//        Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
//        Access elements from the ArrayList: (get method)
        String firstFruit = fruits.get(0);
        System.out.println(firstFruit);  // Output: Apple
//        Modify elements in the ArrayList:  (set method)
        fruits.set(1, "Mango");
//        Remove elements from the ArrayList: (remove method)
        fruits.remove(2);
//        Iterate over the elements of the ArrayList:  (loop)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
    }
}


/*
                SOME OF THE ARRAYLIST METHODS

1.  Adding elements:

add(E element): Appends the specified element to the end of the list.
add(int index, E element): Inserts the specified element at the specified position in the list.

2.  Removing elements:

remove(int index): Removes the element at the specified position from the list.
remove(Object o): Removes the first occurrence of the specified element from the list.
clear(): Removes all elements from the list.

3.  Accessing elements:

get(int index): Returns the element at the specified position in the list.
set(int index, E element): Replaces the element at the specified position with the specified element.
indexOf(Object o): Returns the index of the first occurrence of the specified element in the list.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list.

4.  Checking list information:

size(): Returns the number of elements in the list.
isEmpty(): Returns true if the list contains no elements, otherwise returns false.
contains(Object o): Returns true if the list contains the specified element, otherwise returns false.

5.  Iterating over the list:

iterator(): Returns an iterator over the elements in the list.
forEach(Consumer<? super E> action): Performs the given action for each element of the list.
listIterator(): Returns a list iterator over the elements in the list.

6.  Converting to an array:

toArray(): Returns an array containing all the elements in the list.
toArray(T[] a): Returns an array containing all the elements in the list, in the same order,
                stored in the specified array if it is large enough.
 */
