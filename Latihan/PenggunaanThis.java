public class PenggunaanThis{
	String nama;
	private void namaMahasiswa(String nama){
		this.nama = nama;
	}
	public static void main(String[] args){
		PenggunaanThis thiss = new PenggunaanThis();
		thiss.namaMahasiswa("Arifin");
	}
}