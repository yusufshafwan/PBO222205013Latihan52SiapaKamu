package pbo222205013latihan52siapakamu;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Rizal umur 18 tahun sedang balajar dikelas PBO2");  
    } 
    @Override
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
}
