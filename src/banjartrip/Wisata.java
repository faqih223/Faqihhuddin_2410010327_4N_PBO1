
package banjartrip;

public class Wisata {
    // encapsu
    private String namaWisata;
    private int harga;
    
    //constr
    public Wisata(String namaWisata, int harga){
        this.namaWisata = namaWisata;
        this.harga = harga;
    }
    
    //accesr
    public String getNamaWisata() {
        return namaWisata;
    }
    public int getHarga(){
        return harga;
    }
    //mutator
    private void setNamaWisata(String namaWisata){
        this.namaWisata = namaWisata;
    }
    // method override
    public int hitungTotal(){
        return harga;
    }
}
