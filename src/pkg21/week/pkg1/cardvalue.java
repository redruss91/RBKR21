/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.week.pkg1;

/**
 *
 * @author Riley
 */
public class cardvalue {
    int playeroneOne = 0;
    int playeroneTwo = 0;//represent the two cards in player One's hand.
    int randNum = (int) (Math.random()*11);
    int randNumtwo = (int) (Math.random()*11);
    
  
    
public void firsthand() {
 playeroneOne = (int) randNum;  //call input from different class of player one's hand
 playeroneTwo = (int) randNumtwo;
}


public void displayhandone(){//tells the player 1 what is in his hand
System.out.println("Player 1, you have in your hand a " + this.playeroneOne +" and a "+ this.playeroneTwo +".");
System.out.println("You can choose to hit or stay.");
}


    
    
}
