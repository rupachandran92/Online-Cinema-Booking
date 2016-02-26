/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author seenu
 */
public class Tickets {

    private int SeatPrice;
    private static int child = 8;
    private static int adult = 10;
    private static int oap = 8;

    public Tickets(int SeatPrice) {
        this.SeatPrice = SeatPrice;
    }

    public static int getSeatPrice(Integer c, String s) {
        if (s.equals("adult")) {
            return c * 10;
        }
        if (s.equals("child")) {
            return c * 8;
        }
        if (s.equals("oap")) {
            return c * 8;
        }
        return 0;
    }

    public void setSeatPrice(int SeatPrice) {
        this.SeatPrice = SeatPrice;
    }
    
    public static String calculateStringTotal(int i){
       String str = Integer.toString(i);
       return str;
    }
      
}
