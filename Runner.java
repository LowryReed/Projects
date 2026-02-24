/**
 * Runner class to run the tests and print the results.
 * Reed Lowry
 * 02/23/2026
 * Runner.java
 */
public class Runner {
    public static void main(String[] args) {
        Tests testObj = new Tests();
        testObj.getAverage();
        System.out.println(testObj.toString());
    }
}