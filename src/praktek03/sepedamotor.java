package praktek03;

public class sepedamotor {
    private String warna;
    private String merk;
    private String jenis_motor;
    private double harga; 
    
    void cetakInfo(){
        System.out.println("Warna \t: "+warna+"\n"+
                "Merk \t: "+merk+"\n"+
                "Jenis Motor \t: "+jenis_motor+"\n"+
                "Harga \t "+harga);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis_motor() {
        return jenis_motor;
    }

    public void setJenis_motor(String jenis_motor) {
        this.jenis_motor = jenis_motor;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
