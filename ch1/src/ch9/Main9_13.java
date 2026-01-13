package ch9;
//コンストラクタをオーバーロードしたクラスの利用
public class Main9_13 {

	public static void main(String[] args) {
		Main9_12 h1 = new Main9_12("ミナト");
		System.out.println(h1.name);
		Main9_12 h2 = new Main9_12();
		System.out.println(h2.name);
		

	}

}
