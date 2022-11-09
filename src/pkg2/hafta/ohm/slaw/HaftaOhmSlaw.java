
package pkg2.hafta.ohm.slaw;

import java.util.Scanner;

public class HaftaOhmSlaw {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.println("Enter here the Renitency: ");
        int r =input.nextInt();

        System.out.println("Enter here the Current: ");
        int i =input.nextInt();
        
        int v = r * i;
        System.out.println("value of the Voltage is= "+v);
    }
    
} 