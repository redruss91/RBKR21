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
    
    double playertwoOne = 0;
    double playertwoTwo = 0;
    double randNum = Math.random()*11;    
    
    
public void firsthand() {
 playertwoOne = randNum;//call input from different class of player two's hand
}


public void secondhand() {
 playertwoTwo = randNum;   //call input from different class of player one's hand
}


public void displayhandtwo(){//tells the player 2 what is in his hand
System.out.println("Player 2, you have in your hand a " + playertwoOne + "and a "+ playertwoTwo + "."); 
        
System.out.println("You can choose to hit or stay.");
}  
    
}
