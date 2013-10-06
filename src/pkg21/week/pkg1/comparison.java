/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21.week.pkg1;

/**
 *
 * @author Riley
 */
public class comparison {
    cardvalue player = new cardvalue();
    cardvaluetwo playertwo = new cardvaluetwo();
    @SuppressWarnings("empty-statement")
    public void playercomp(){
        if(player.playeroneOne + player.playeroneTwo  >= playertwo.playertwoOne + playertwo.playertwoTwo)//taken from cardvalueone & two
         System.out.println("Player one wins");                                           
        
        else
        System.out.println("Player two wins");
            
        
    };
    
}
