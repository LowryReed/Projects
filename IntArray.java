/** 
 * Reed Lowry
 * IntArray class that implements a simple array of integers with various methods to manipulate it.
 * 03/30/2026
 */
import java.util.Random;

public class IntArray {

    private int length;
    private int myArray[];

    // constructor initializes array with given size
    public IntArray(int size) {
        length = size;
        myArray = new int[length];
    }

    // returns number of elements in array
    public int size() {
        return length;
    }

    // fills array with random numbers between 1 and 6
    public void fillRand() {
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // returns value at given index
    public int get(int index) {
        return myArray[index];
    }

    // sets value at given index
    public void set(int index, int value) {
        myArray[index] = value;
    }

    // clears the array
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // checks if array is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // sorts array in ascending order
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
    }

    // returns array as a formatted string
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < length; i++) {
            result += myArray[i];
            if (i < length - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }
}