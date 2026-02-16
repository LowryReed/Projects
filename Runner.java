/**
 * Reed Lowry
 * Runner.java
 * This program defines the Pet class with methods to set and get the pet's name
 * while showing how it works with the main method.
 * 02-16-2026
 */
public class Runner {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Guinness");
        pet1.setType("Dog");
        pet1.setAge(1);
        System.out.println(pet1);

        Pet pet2 = new Pet();
        pet2.setName("Loki");
        pet2.setType("Dog");
        pet2.setAge(9);
        System.out.println(pet2);

        Pet pet3 = new Pet();
        pet3.setName("Scout");
        pet3.setType("Dog");
        pet3.setAge(12);
        System.out.println(pet3);
    }
}