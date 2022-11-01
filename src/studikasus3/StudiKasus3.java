package studikasus3;
import java.util.Scanner;
public class StudiKasus3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        String nama;
        
        System.out.print("Nama Pembeli: ");
        nama=input.nextLine();
        
        System.out.print("Pilihan:\n 1. Alat Olahraga \n 2. Alat Elektronik \n 3. Alat Masak \n");
        System.out.println("Masukan Pilihan");
        angka=input.nextInt();
        System.out.println("======================");
        switch (angka){
            case 1:
                    System.out.println("Alat Olahraga");
            break;
            case 2:
                    System.out.println("Alat Elektronik");
            break;
            case 3:
                    System.out.println("Alat Masak");
            break;
            default:
                System.out.println("Anda Salah Memasukkan Kode");       
                    

                
            
        }
    }
    
}
