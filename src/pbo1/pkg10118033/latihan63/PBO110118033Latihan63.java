
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan Garis Lurus.
 *  
 */

package pbo1.pkg10118033.latihan63;

public class PBO110118033Latihan63 {
    public static void main(String[] args) {
        Koordinat koor = new Koordinat(2,10,5,7);
        System.out.printf("Garis yang melalui titik (%d, %d) dan (%d, %d)\nmemiliki gradien sebesar %d\n"
                ,koor.getX1(),koor.getY1(),koor.getX2(),koor.getY2(),koor.hitungGradien());
        
        Koordinat koor1 = new Koordinat(5,1,3,12);
        System.out.printf("Garis yang melalui titik (%d, %d) dan (%d, %d)\nmemiliki gradien sebesar %d\n"
                ,koor1.getX1(),koor1.getY1(),koor1.getX2(),koor1.getY2(),koor1.hitungGradien());
    }
}