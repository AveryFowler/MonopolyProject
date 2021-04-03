/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolygame;
import java.util.*;
/**
 *
 * @author Avery Fowler
 */
public class PropertyList {
    private int placement = 0;
    private int owner = 0;
    private int price = 0;
    private int rent = 0;
    private int monopolyRent = 0;
    private int houseNum = 0;
    private int house1 =  0;
    private int house2 = 0;
    private int house3 = 0;
    private int house4 = 0;
    private int hotel = 0;
    private int mortgage = 0;
    private int unmortgage = 0;
    public PropertyList(int place, int own, int pri, int re, int monoRe, int one, int two, int three, int four, int hot, int mort, int unmort){
        int placement = place;
        int owner = own;
        int price = pri;
        int rent = re;
        int monopolyRent = monoRe;
        int houseNum = 0;
        int house1 =  one;
        int house2 = two;
        int house3 = three;
        int house4 = four;
        int hotel = hot;
        int mortgage = mort;
        int unmortgage = unmort;
    }
    
    public void setProperty(){
        
        PropertyList brown1 = new PropertyList(1, 0, 60, 2, 4, 10, 30, 90, 160, 250, 30, 33);
        PropertyList brown2 = new PropertyList(3, 0, 60, 2, 4, 20, 60, 180, 160, 320, 30, 33);
        PropertyList lightBlue1 = new PropertyList(6, 0, 100, 6, 12, 30, 90, 270, 400, 550, 50, 55);
        PropertyList lightBlue2 = new PropertyList(8, 0, 100, 6, 12, 30, 90, 270, 400, 550, 50, 55);
        PropertyList lightBlue3 = new PropertyList(9, 0, 120, 8, 16, 40, 100, 300, 450, 600, 60, 66);
        PropertyList pink1 = new PropertyList(11, 0, 140, 10, 20, 50, 150, 450, 625, 750, 70, 77);
        PropertyList pink2 = new PropertyList(13, 0, 140, 10, 20, 50, 150, 450, 625, 750, 70, 77);
        PropertyList pink3 = new PropertyList(14, 0, 160, 12, 24, 60, 180, 500, 700, 900, 80, 88);
        PropertyList orange1 = new PropertyList(16, 0, 180, 14, 28, 70, 200, 550, 750, 950, 90, 99);
        PropertyList orange2 = new PropertyList(18, 0, 180, 14, 28, 70, 200, 550, 750, 950, 90, 99);
        PropertyList orange3 = new PropertyList(19, 0, 200, 16, 32, 80, 220, 600, 800, 1000, 100, 110);
        PropertyList red1 = new PropertyList(21, 0, 220, 18, 36, 90, 250, 700, 875, 1050, 110, 121);
        PropertyList red2 = new PropertyList(23, 0, 220, 18, 36, 90, 250, 700, 875, 1050, 110, 121);
        PropertyList red3 = new PropertyList(24, 0, 220, 20, 40, 100, 300, 750, 925, 1100, 120, 132);
        PropertyList yellow1 = new PropertyList(26, 0, 260, 22, 44, 110, 330, 800, 975, 1150, 130, 143);
        PropertyList yellow2 = new PropertyList(27, 0, 260, 22, 44, 110, 330, 800, 975, 1150, 130, 143);
        PropertyList yellow3 = new PropertyList(29, 0, 280, 24, 48, 120, 360, 850, 1025, 1200, 140, 154);
        PropertyList green1 = new PropertyList(31, 0, 300, 26, 52, 130, 390, 900, 1100, 1275, 150, 165);
        PropertyList green2 = new PropertyList(32, 0, 300, 26, 52, 130, 390, 900, 1100, 1275, 150, 165);
        PropertyList green3 = new PropertyList(34, 0, 320, 28, 56, 150, 450, 1000, 1200, 1400, 160, 176);
        PropertyList blue1 = new PropertyList(37, 0, 350, 35, 70, 175, 500, 1100, 1300, 1500, 175, 193);
        PropertyList blue2 = new PropertyList(39, 0, 400, 50, 100, 200, 600, 1400, 1700, 2000, 200, 220);
    }
}

