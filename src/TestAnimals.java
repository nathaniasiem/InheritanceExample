/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog Max = new Dog("Max",2,"Cockapoo","Chestnut Brown and White");
        Cat Whiskers = new Cat("Whiskers",3,"Siamese","Black and Tan");
        Dog Spike = new Dog("Spike",8,"Bulldog","Brown");
        Max.speak();
        Whiskers.speak();
        System.out.println(Max);
        
        Pet[]p = new Pet[3];
        p[0]=Max;
        p[1]=Spike;
        p[2]=Whiskers;
        
    }
}
