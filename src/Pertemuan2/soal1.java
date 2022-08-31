package Pertemuan2;
import java.util.Scanner;

public class soal1 {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 0;
        while(i<=5) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.print("Masukan Angka :");
        String user = myObj.nextLine(); // Read user Input
        try {
            long masukan = Long.parseLong(user);
            if(masukan < Byte.MAX_VALUE && masukan > Byte.MIN_VALUE) {
                System.out.println(masukan + " can be fitted in");
                System.out.println(" * short\n * int \n * long ");
            }else if(masukan < Short.MAX_VALUE && masukan < Short.MIN_VALUE) {
                System.out.println(masukan + " can be fitted in");
                System.out.println(" * int \n *long ");
            }else if(masukan > Integer.MIN_VALUE && masukan < Integer.MAX_VALUE) {
                System.out.println(masukan + " can be fitted in");
                System.out.println(" * int \n * long ");
            }else if(masukan < Long.MAX_VALUE && masukan > Long.MIN_VALUE) {
                System.out.println(masukan + " can be fitted in");
                System.out.println(" * long ");
            }
        }   
        catch(NumberFormatException e) {
            System.out.println(" can’t be fitted anywhere");
        }
        System.out.println();
        i=i+1;
        }
        }
}
