/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolygame;

/**
 *
 * @author Avery Fowler
 */

public class SpecialPropertyList {
    
    private int placement;
    private int owner = 0;
    private int price = 0;
    private int rent1 = 0;
    private int rent2 = 0;
    private int mortgage = 0;
    private int unmortgage = 0;
    
    public SpecialPropertyList(int pos){
        placement = pos;
        owner = 0;
        price = 150;
        rent1 = 4*GamePage.outDice;
        rent2 = 10*GamePage.outDice;
        mortgage = 75;
        unmortgage = 83;
    }
    public void setSpecialProp(){
        SpecialPropertyList electric = new SpecialPropertyList(12);
        SpecialPropertyList waterWorks = new SpecialPropertyList(28);
        
    }
    
}
