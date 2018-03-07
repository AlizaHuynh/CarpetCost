/*
 * Aliza Huynh
 * CarpetCost.java
 * This program calculates the cost of a carpet per square meter
 * depending on the dimensions of the room
 */

package carpetcost1;

/**
 *
 * @author alhuy9821
 */
public class CarpetCost1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double length = 8.5;
        double width = 6;
        double costPerMeter = 19.95;
        double cost = 0.0;
        
        cost = length * width * costPerMeter;
        
        System.out.println("The cost of the carpet is " + cost + "dollars.");
    }
    
}
