public class Method1{
	public static void main(String[] args){
		Method1 method = new Method1();
		method.methodTampilkan2("Belajar java Yuks 2");
		System.out.println(method.tambahkanNilai(3, 5));
	}
	private void methodTampilkan2(String nama){
		System.out.println(nama);
	}
	private int	tambahkanNilai(int x, int y){
		return x + y;
	}
}