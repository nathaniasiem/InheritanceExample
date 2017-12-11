/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Dog extends Pet{
    //always call this method first; even if there is no constructor
    //constructor 
     public Dog(String name, int age, String breed, String colour){
        //pass through the variables 
         super(name,age,breed,colour);
     }
    @Override
    public void speak(){
        System.out.println("WOOF WOOF");
    }
}
