import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nilai {
     public static void main(String[] args) throws IOException{
       BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
       String nama;
       System.out.print("Masukkan Nama = ");
       nama=x.readLine();

       String mid;
       System.out.print("Masukkan mid = ");
       mid=x.readLine();
        
       String uas;
       System.out.print("Masukkan uas = ");
       uas=x.readLine();
      
       String pra;
       System.out.print("Masukkan praktikum = ");
       pra=x.readLine();
      
       String hadir;
       System.out.print("Masukkan jml presensi = ");
       hadir=x.readLine();
      
        //ubah tipe data
       
       int mid1=Integer.parseInt(mid);
       int uas2=Integer.parseInt(uas);
       int pra1=Integer.parseInt(pra);
      
       //cari nilai

       System.out.println("-------------------------------------------------");
       System.out.println("Nama Siswa = "+nama);

       double hasil=(0.35*mid1)+(0.4*uas2)+(pra1*0.25);
       System.out.println("Nilai akhir = "+hasil);
       //mengecek kehadiran
       int h=Integer.parseInt(hadir);
       double total;
       if (h>=10)
           total=hasil+10;
       else
           total=hasil;
       System.out.println("Nilai final = "+total);
      
       if (total>=100)
           total=100;
       System.out.println("Nilai fix   = "+total);
      
       char nh;
       if (total>=80)
           nh='A';
       else if ((total>=60)&&(total<80))
           nh='B';
       else if (total>=40)
           nh='C';
       else if (total>=20)
           nh='D';
       else
           nh='E';
       System.out.println("Nilai Predikat  = "+nh);
    }
   }