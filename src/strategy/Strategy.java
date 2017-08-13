/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategy;

/**
 *
 * @author Ali Othman
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Animal sparky = new Dog();
        Animal tweety = new Bird();
       
        System.out.println("Dog: " + sparky.tryToFly());
       
        System.out.println("Bird: " + tweety.tryToFly());
       
        // This allows dynamic changes for flyingType
       
        sparky.setFlyingAbility(new ItFlys());
       
        System.out.println("Dog: " + sparky.tryToFly());
       
    }
    }
    

