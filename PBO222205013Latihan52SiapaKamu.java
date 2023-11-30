package pbo222205013latihan52siapakamu;

/**
 *
 * @author ASUS
 */
public class PBO222205013Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Dosen dosen;
        Mahasiswa mhs;
        
        dosen = new Dosen();
        System.out.println("NIP Dosen\t: 41227829930");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        mhs = new Mahasiswa();
        System.out.println("NIM Mahasiswa\t: 10110269");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
