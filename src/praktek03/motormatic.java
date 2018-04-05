
package praktek03;

public class motormatic extends sepedamotor{
    private String jenis_transmisi;
    
    void throttle(){
        System.out.println("gearbox manual");
    }

    public String getJenis_transmisi() {
        return jenis_transmisi;
    }

    public void setJenis_transmisi(String jenis_transmisi) {
        this.jenis_transmisi = jenis_transmisi;
    }
    
    
}
