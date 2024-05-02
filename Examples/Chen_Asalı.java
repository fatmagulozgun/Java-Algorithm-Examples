package Examples;

import java.util.Scanner;

public class Chen_Asalı {

    public static void main(String[] args) {
        //klavyeden girilen pozitif tam sayının chen asalı olup olmadığını test eden program 
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir n sayısı giriniz:");
        int n = scan.nextInt();

        if (isChenPrime(n)) {
            System.out.println("sayı Chen asal sayısıdır.");
        } else {
            System.out.println("sayı Chen asalı değildir.");
        }
    }

   
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public static boolean isChenPrime(int number) {
        if (!isPrime(number)) {
            return false;
        }
        int nextPrime = number + 2;
        return isPrime(nextPrime);
    }

}
