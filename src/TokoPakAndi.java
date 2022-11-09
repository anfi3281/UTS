import java.util.Scanner;
public class TokoPakAndi {
    public static void main(String[] args) throws Exception {      
        Scanner input = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("*            Toko Pak Andi            *");
        System.out.println("*    menyediakan barang sehari-hari   *");
        System.out.println("***************************************");
        System.out.println("");
        System.out.println("Kami menjual sembako");
        System.out.println("");
        System.out.println("1. Beras   = Rp 20000/kg");
        System.out.println("2. Tepung = Rp 5000/kg");
        System.out.println("3. Gula = Rp 10000/kg");
        System.out.println("4. Minyak Goreng = Rp 12000/liter");
        System.out.println("Masukkan jenis sembako :");
        int js = input.nextInt();
        String barang="";
        int harga = 0;
        if(js == 1){
            barang = "beras";
            harga = 20000;
        }else if(js == 2){
            barang = "tepung";
            harga = 5000;
        }else if(js == 3){
            barang = "gula";
            harga = 10000;
        }else if(js == 4){
            barang = "minyak goreng";
            harga = 12000;
        }
        System.out.println("Masukkan jumlah "+barang+" yang akan dibeli :");
        int jb = input.nextInt();
        int tp = harga * jb;
        System.out.println("Total Pembelian Rp "+tp);
    }    
}
