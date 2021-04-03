/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolygame;

import java.util.Random;
/**
 *
 * @author Avery Fowler
 */
public class Board {
    private static int die1 = 6;
    private static int die2 = 9;
    private static int dieTotal = 0;
    private static int[] playerPosition;
    private static int jCount;
    private static int currPlayer;
            
    public static void setPlayerPosition(int players){
        playerPosition = new int [players];
        for(int i=0; i<playerPosition.length; i++){
            playerPosition[i] = 1;
        }
    }
    public static void roll(){
        Random rand = new Random();
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1;
        dieTotal = die1 + die2;
        if(die1 == die2){
            jCount++;
            checkJCount(currPlayer);
        }
        
    }
    public static int getDie1(){
        return die1;
    }
    
    public static int getDie2(){
        return die2;
    }
    
    public static int getDieTotal(){
        return dieTotal;
    }
    public static int getPosition(int player){
        return playerPosition[player];
    }
    public static void movePlayerDice(int player){
        playerPosition[player] =+ dieTotal;
        if(playerPosition[player] > 40){
            playerPosition[player] -= 40;
            //add +200 monies
        }
    }
    public static void movePlayerSet(int player, int position){
        playerPosition[player] = position;
        
    }
    public static void checkJCount(int player){
        if(jCount == 3){
            movePlayerSet(player,41);
        }
    }
    
}
