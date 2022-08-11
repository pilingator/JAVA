//Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class HW00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int k = 0;
        for (int i = 1; i<=n; i++) {
            k = i*(i+1)/2;
            
            //System.out.println(k);  
        }
        System.out.println(k);
   }

}

