
package praktek03;


public class sepedamotorAksi {
    public static void main(String[] args) {
        sepedamotor a = new sepedamotor();
        a.setWarna("biru");
        a.setMerk("beat");
        a.setJenis_motor("scooter");
        a.setHarga(1000);
        //gak bisa jugaa pak wkwkwk a.setjenis_transmisi();
        
        a.cetakInfo();
        
        System.out.println("Warnanya \t: ");
        System.out.println(a.getWarna());
        System.out.println("Merknya \t: ");
        System.out.println(a.getMerk());
        System.out.println("Jenis Motornya \t: ");
        System.out.println(a.getJenis_motor());
        System.out.println("Harganya \t: ");
        System.out.println(a.getHarga());
        
        motormatic bb = new motormatic();
        bb.setWarna("putih");
        bb.setMerk("vario");
        bb.setJenis_motor("scooter");
        bb.setHarga(2000);
        bb.setJenis_transmisi("matic");
        bb.cetakInfo();
        System.out.println("Jenis Transmisi \t:"+bb.getJenis_transmisi());
        bb.throttle();
    }
}
