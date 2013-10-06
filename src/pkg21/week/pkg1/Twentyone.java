/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.week.pkg1;

import java.util.Scanner;

/**
 *
 * @author Riley
 */
public class Twentyone{
    String name;
    String instructions = "Players have to try to get as close to 21\n"
            + "as possible.\n"
            + "They can hit (recieve more cards) or stay (keep cards).";

   
    public static void main(String[] args) {
        Twentyone myGame = new Twentyone();
        myGame.getName();
        myGame.displayHelp();
        
        cardvalue onehand = new cardvalue();
        onehand.firsthand();
        onehand.displayhandone();
        
        cardvaluetwo twohand = new cardvaluetwo();
        twohand.secondhand();
        twohand.displayhandtwo();
        
        comparison compare = new comparison();
        compare.playercomp();
        
        
    }

public void getName() {
Scanner input = new Scanner(System.in);
System.out.println("Enter your name: ");
this.name = input.next();
}


public void displayHelp(){
System.out.println("\nWelcome " + this.name + " to 21\n");
System.out.println(this.instructions);
}





}

