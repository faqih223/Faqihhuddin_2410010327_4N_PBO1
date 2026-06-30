
package banjartrip;

public class Booking extends Wisata {
    
    private String namaPelanggan;
    private int jumlahOrang;
    
    //consta
    public Booking(String namaWisata, int harga, String namaPelanggan, int jumlahOrang){
        
        super(namaWisata, harga);
        this.namaPelanggan = namaPelanggan;
        this.jumlahOrang = jumlahOrang;
    }
    
    //getter
    public String getNamaPelanggan(){
        return namaPelanggan;
    }
    public int getJumlahOrang(){
            return jumlahOrang;
    }
    
    //setter
    public void setNamaPelanggan(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
    }
    
    //polymop
    public int hitungTotal(){
        int total = getHarga() * jumlahOrang;
        
        //seleksi
        if (jumlahOrang >= 5) {
            total = total -(total * 10 / 100);
        }
        return total;
        
    }
    public void tampilkan(){
        System.out.println("----------");
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Wisata         :" + getNamaWisata());
        System.out.println("Harga          : Rp " + getHarga());
        System.out.println("Jumlah Orang   :" + jumlahOrang);
        System.out.println("Total Bayar    : Rp" + hitungTotal());
    }
}
