/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradinggamecontrol;

import java.util.Scanner;

/**
 *
 * @author christa
 */
public class scan {
    static Scanner scan = new Scanner(System.in);
    
    public static String string(String question){
        System.out.print(question + ":");
        String answer = scan.next();
        return answer;
    }
    
    public static int integer(String question) {
        System.out.print(question + ":");
        return scan.nextInt();
    }
    
    public static double Double(String question) {
        System.out.print(question + ":");
        return scan.nextDouble();
    }
}
