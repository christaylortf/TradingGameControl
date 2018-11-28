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
    
    public static void add(int accNo, double amount) {
        balances[accNo] += amount;
        System.out.println(""+companies.companies[accNo]+" has £"+balances[accNo]);
    }
    
    public static void minus(int accNo, double amount) {
        balances[accNo] -= amount;
        System.out.println(""+companies.companies[accNo]+" has £"+balances[accNo]);
    }
    
    public static void tax(double amount) {
        double runningTotal = 0;
        for(int cnt=1;cnt<companies.companies.length;cnt++)
        {  
            balances[cnt] -= amount;
            runningTotal += amount;
        }
        balances[0] = runningTotal;
        System.out.println("Everyone has been taxed £"+amount);
    }
    
    public static void transaction(int companyTo, int companyFrom, double amount) {
        balances[companyFrom] -= amount;
        balances[companyTo] += amount;
        System.out.println("Transaction complete.");
    }
}
