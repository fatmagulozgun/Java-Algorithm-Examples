package Examples;

import java.util.Scanner;

public class palindromik_kelime_bulma {
//adana=anada yatay=yatay

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kelime gir:");
        String kelime = sc.nextLine();
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        if(kelime.equals(tersKelime)){
            System.out.println(kelime+"polindromdur");
        }else{
            System.out.println(kelime+"değildir");
        }

    }
}
