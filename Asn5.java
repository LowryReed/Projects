/**
 * Reed Lowry
 * In this assignment, we will be working with ArrayLists in Java.
 *  We will create two ArrayLists, one for storing strings (fruits) and another for storing integers (numbers).
 *  We will perform various operations such as adding, removing, and updating elements in the ArrayLists,
 *  and then print the contents of both lists to the console.
 * 04/15/2026
 */

import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nNumbers List:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        fruits.remove("Banana");
        numbers.remove(1);

        fruits.add(1, "Mango");
        numbers.add(2, 25);

        System.out.println("\nUpdated Fruits List:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nUpdated Numbers List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}