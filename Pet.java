/**
 * Reed Lowry
 * Pet.java
 * This program defines a Pet class with methods to set and get the pet's name,
 * and includes a main method to demonstrate its functionality.
 * 02-08-2026
 * Updated 02-16-2026
 */
public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        this.name = "";
        this.type = "Animal";
        this.age = 1;
    }

    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    public String speak() {
        if (type.equals("Dog")) {
            return "Woof";
        } else if (type.equals("Cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    public String toString() {
        return "Pet information:\n"
                + "Type: " + type + "\n"
                + "Name: " + name + "\n"
                + "Sound: " + speak() + "\n"
                + "Age:  " + age;
    }
}