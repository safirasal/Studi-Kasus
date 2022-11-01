package studikasusfungsi2;
public class StudiKasusFungsi2 {
    
    public static String title = "=====BIODATA DIRI=====";
    
    public static void cetakTitle(){
        System.out.println(title);
    }
    public static void cetakNama (String nama){
        System.out.println("Nama Lengkap :" +nama);
    }
    public static void cetakTanggal (String tanggal){
         System.out.println("Tanggal Lahir:" +tanggal);
    }
    public static void cetakUsia (String usia ){
        System.out.println("Usia :" +usia);
    }
    public static void cetakAsal (String asal ){
        System.out.println("Asal :" +asal);
    }
    public static void main(String[] args){
           cetakTitle();
           cetakNama("SAFIRA SALSABILA BRAMANTI");
           cetakTanggal("28 FEBRUARI 2005");
           cetakUsia("15 TAHUN");
           cetakAsal("MALANG");
    }
    
}
