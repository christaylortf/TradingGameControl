/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradinggamecontrol;

/**
 *
 * @author christa
 */
public class worldBank {
    public static double[] balances = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    
    public static String add(int accNo, double amount) {
        return ""+companies.companies[accNo]+" has £"+balances[accNo];
    }
}
