public class MethodOverloading {
	public static void main(String[] args){
		MethodOverloading method = new MethodOverloading();
		method.methodTampilkan3("Belajar java Yuks 3");
		method.methodTampilkan3("Belajar java Yuks 3", "Hingga mengerti");
	}
	private void methodTampilkan3(String nama) {
		System.out.println(nama);
	}
	private void methodTampilkan3(String nama1, String nama2){
		System.out.println(nama1 + nama2);
	}
}