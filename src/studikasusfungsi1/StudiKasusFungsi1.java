package studikasusfungsi1;
import java.util.Scanner;
public class StudiKasusFungsi1 {
public static void hitung (int bil1, int bil2, int bil3, int maks){
    System.out.println("Nilai tertinggi adalah= " + maks);
}
    public static void main(String[] args) { 
       int maks;
       String identitas;
       Scanner input=new Scanner (System.in);
       
       System.out.print("Identitas :");
       identitas = input.nextLine();
       
       System.out.print("Masukkan nilai 1 :");
       int bil1 = input.nextInt();
       
       System.out.print("Masukkan nilai 2 :");
       int bil2 = input.nextInt();
       
       System.out.print("Masukkan nilai 3 :");
       int bil3 = input.nextInt();
       
       if(bil1>bil2 && bil1>bil3){
       maks=bil1;
       }else if(bil2>bil1 && bil2>bil3){
       maks=bil2;
       }else{
       maks = bil3;
       }
       hitung(bil1, bil2, bil3, maks);
       return;
       }
    }

    

