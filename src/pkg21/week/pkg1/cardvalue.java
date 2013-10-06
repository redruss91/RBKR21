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
    double playeroneOne = 0;
    double playeroneTwo = 0;//represent the two cards in player One's hand.
    double randNum = Math.random()*11;
  
    
public void firsthand() {
 playeroneOne = randNum;  //call input from different class of player one's hand
}


public void secondhand() {
 playeroneTwo = randNum;   //call input from different class of player one's hand
}

public void displayhandone(){//tells the player 1 what is in his hand
System.out.println("Player 1, you have in your hand a " + playeroneOne +" and a "+ playeroneTwo +".");
System.out.println("You can choose to hit or stay.");
}


    
    
}
