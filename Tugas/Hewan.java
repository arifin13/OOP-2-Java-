public class Hewan {
	//class dan void untuk inputan
    int kaki;
    String Nama, Makanan;
    void inputData (String x,String y, int z){
        kaki=z;
        Nama=x;
        Makanan=y;
}
    //method yang dibutuhkan 
    void cetak (){
        System.out.println("Nama Hewan    = "+Nama);
        System.out.println("Makanan       = "+Makanan);
        System.out.println("Jumlah kaki   = "+kaki);
}
		//panggil class dan method yang sudah dibuat
        public static void main(String[] args) {
        Hewan r = new Hewan();
        r.inputData("Kura-kura", "Sayuran dan Buah-buahan", 4);
        r.cetak();
    }
}