package studikasus;
import java.util.Scanner;
public class StudiKasus {
    public static void main(String[] args) {
        int nilaiMtk, nilaiKimia, nilaiBio, nilaiFisika, average;
        int jumlah = 4;
        boolean running = true;
        Scanner input = new Scanner (System.in);
        String jawab;
        
        //PERULANGAN
        //masukkan data nilai
        while (running){
            System.out.println ("--------DATA NILAI--------");
            System.out.println ("Masukkan Data Nilai Anda");
            System.out.println ("Nilai Matematika: ");
            nilaiMtk = input.nextInt();
            System.out.println ("Nilai Kimia: ");
            nilaiKimia = input.nextInt();
            System.out.println ("Nilai Biologi: ");
            nilaiBio = input.nextInt();
            System.out.println ("Nilai Fisika: ");
            nilaiFisika = input.nextInt(); 
            
        //proses perhitungan
        average= (nilaiMtk+nilaiKimia+nilaiBio+nilaiFisika)/jumlah;
        System.out.println ("Rata-rata: " +average);
        
        //percabangan 
        if (average>75){   
           System.out.println ("Selamat Anda lulus!");
        }else{
           System.out.println ("Mohon Maaf Anda tidak lulus");
        } 
        
        //perulangan
        System.out.println ("Apakah anda ingin memasukkan data nilai lagi? [jawab" + " Ya/Tidak] ");
        jawab = input.next();
        if (jawab.equalsIgnoreCase("YA")){
            running = true;
        }
        else if (jawab.equalsIgnoreCase("TIDAK")){
            running = false;
       }
        }
    }
} 
    
