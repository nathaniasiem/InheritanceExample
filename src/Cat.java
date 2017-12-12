/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Cat extends Pet {
    private int livesRemaining;
    
     public Cat(String name, int age, String breed, String colour){
         super(name,age,breed,colour);
         livesRemaining = 9;
     }
     @Override
     public void speak(){
         System.out.println("MEOW MEOW");
     }
    @Override
    public String toString(){
        //enables us to add more information but keep information
         String fromPet = super.toString();
         fromPet+= "\nLives: "+ livesRemaining;
         fromPet += "\nType: Cat";
         return fromPet;
        
    }
}
