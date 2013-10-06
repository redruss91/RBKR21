/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.week.pkg1;

/**
 *
 * @author Riley
 */
public class cardvaluetwo { //player two's hand
    
    int playertwoOne = 0;
    int playertwoTwo = 0;
    int randNum = (int) (Math.random()*11);   
    int randNumtwo = (int) (Math.random()*11);
    
    
    /**
     *
     */
    public void secondhand() {
 playertwoOne = (int) randNum;//call input from different class of player two's hand
 playertwoTwo = (int) randNumtwo;
}


public void displayhandtwo(){//tells the player 2 what is in his hand
System.out.println("Player 2, you have in your hand a " + this.playertwoOne + " and a "+ this.playertwoTwo + "."); 
        
System.out.println("You can choose to hit or stay.");
}  
    
}
