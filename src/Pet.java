/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * used as a building block abstract class to tell the characteristics but
 * unable to create physical form
 *
 * @author simon7323
 */
public abstract class Pet {

    private String name;
    private int age;
    private String breed;
    private String colour;

    public Pet(String name, int age, String breed, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String output = "-----------";
        output += "Name: " + this.name + "\n";
        output += "Age: " + this.age + "\n";
        output += "Breed: " + this.breed + "\n";
        output += "Colour: " +this.colour + "\n";
        return output;

    }
    public abstract void speak(){
        
    }
}
