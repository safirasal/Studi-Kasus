package transaksi;
import java.util.Scanner;
public class Transaksi {
    
    public static void main(String[] args) {
         String nomortransaksi,tanggalpembelian,waktu,barangpembelian;
         double totalharga,totalpembayaran,kembalian;
         
         Scanner input = new Scanner(System.in);
         
         System.out.println("<<<<SWALAYAN APRILMART>>>>");
         System.out.println("Nomor Transaksi:");
         nomortransaksi = input.nextLine();
         System.out.println("Tanggal Pembelian:");
         tanggalpembelian = input.nextLine();
         System.out.println("Waktu:");
         waktu = input.nextLine();
         System.out.println("Barang Pembelian:");
         barangpembelian = input.nextLine();
         System.out.println("Total Harga:Rp");
         totalharga = input.nextInt();
         System.out.println("Total Pembayaran:Rp");
         totalpembayaran = input.nextInt();
         
         kembalian = (totalpembayaran-totalharga);
         System.out.println("Uang kembalian:Rp" + kembalian);
           
    }
    
}
