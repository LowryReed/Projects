/**
 * Reed Lowry
 * Pet.java
 * This program defines a Pet class with methods to set and get the pet's name,
 * and includes a main method to demonstrate its functionality.
 * 02-08-2026
 */
public class Pet {
    private String name;
    public Pet() {
        this.name = "";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "Pet information:\nName: " + this.name;
    }
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        pet1.setName("Guinness");
        System.out.println(pet1);
        Pet pet2 = new Pet();
        pet2.setName("Loki");
        System.out.println(pet2);
    }
}