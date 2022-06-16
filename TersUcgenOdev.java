package Hesaplamalar;

import java.util.Scanner;

public class TersUcgenOdev {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen Basamak Sayisini Giriniz :");
        int digit=input.nextInt();

        for (int i=1;i<=digit;i++){

            for (int space=1;space<=i;space++){
                System.out.print(" ");

            }
            for (int j=1;j<=(2*digit-(2*i+1));j++){
                System.out.print("*");
        }
            System.out.println();
    }
}
}
