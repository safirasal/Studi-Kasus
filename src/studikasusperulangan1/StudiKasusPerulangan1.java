package studikasusperulangan1;
import java.util.Scanner;
public class StudiKasusPerulangan1 {

    public static void main(String[] args) {
        int Count = 0;
        String Nama;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda =");
        Nama = input.nextLine();
        char[] huruf = Nama.toCharArray();
        for (int i=0; i<huruf.length; i++){
            if (huruf [i] == 'a'|huruf [i] == 'A') {
                Count++; 
            }
        }
        System.out.println("----------------------------");
        System.out.println("Nama Anda : "+ Nama);
        System.out.println("Jumlah huruf 'A' yang ada di Nama Anda Sebanyak : "+Count);
    }
    
}
