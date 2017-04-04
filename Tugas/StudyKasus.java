import java.util.Scanner;
  
public class StudyKasus {
  public static Scanner input = new Scanner(System.in); 
 
  public static void main(String[] args) {
    float ip_mahs = 0, jumlah_ip_mahs = 0, rata_rata = 0;
    int jumlah_mhs = 0, mhs_lulus = 0, mhs_tidak_lulus = 0;
    boolean exit = false;

    System.out.println("\n");
    System.out.println("STUDY KASUS IP MAHASISWA ");
    System.out.println(" Data IP Mahasiswa Lulus, Tidak Lulus, dan Nilai Rata-rata ");
    do { 
      System.out.print("Input Nilai IP Mahasiswa : ");
      ip_mahs = input.nextFloat();
      if(isWithinRange(ip_mahs, 0f, 4f) == 1) { 
         jumlah_mhs++; 
         if(isWithinRange(ip_mahs, 2.75f, 4f) == 1) { 
           mhs_lulus++; 
         }
         else {
           mhs_tidak_lulus++; 
         }
         jumlah_ip_mahs += ip_mahs; 
       }
       else if (ip_mahs == -999) { 
         exit = true;
       }
    } while (!exit);
 
    System.out.println("\n=\n");
    if (jumlah_mhs > 0) { 
      rata_rata = jumlah_ip_mahs / jumlah_mhs;
      System.out.println("Jumlah Mahasiswa                    : " + jumlah_mhs);
      System.out.println("Jumlah Mahasiswa Lulus (IP >= 2.75) : " + mhs_lulus);
      System.out.println("Jumlah Mahasiswa Tidak Lulus        : " + mhs_tidak_lulus);
      System.out.println("Nilai Rata-Rata IP Mahasiswa        : " + rata_rata);
    }
    else { 
      System.out.println("TIDAK ADA DATA");
    }
      System.out.println("\n=\n");
  }
  
  public static int isWithinRange(float x, float min, float max) { 
    byte result = 1;
      if (x < min || x > max) {
        result = 0;
      }
      return result;
  }
}