package studikasus2;
import java.util.Scanner;
public class StudiKasus2 {

    public static void main(String[] args) {
        double JumlahPenjualan,
                UangJasa1 = 10000,
                UangJasa2 = 20000,
                UangJasa3 = 30000;
        Scanner input = new Scanner(System.in);
        
        System.out.println("<<<<<Perusahaan SoftDrink Cooland");
        System.out.println("     -----------------------     ");
        System.out.println("Hasil Penjualan: ");
        JumlahPenjualan = input.nextDouble();
        
        if (JumlahPenjualan==200000){
            System.out.println("Selamat! Kamu mendapat uang sebanyak:");
            System.out.println(UangJasa1+(0.1*JumlahPenjualan));
            
        }else if(JumlahPenjualan>200000){
            System.out.println("Selamat! Kamu mendapat uang sebanyak:");
            System.out.println(UangJasa2+(0.15*JumlahPenjualan));
            
        }else if(JumlahPenjualan>500000){
            System.out.println("Selamat! Kamu mendapat uang sebanyak:");
            System.out.println(UangJasa2+(0.2*JumlahPenjualan));
            
            
        }
        
    }
    
}
