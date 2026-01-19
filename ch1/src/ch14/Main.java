package ch14;
//何も定義していないクラスでtoString()を呼ぶ
public class Main {
//extendsで親クラスを指定しなければjava.lang.Objectを継承したとみなされる。
	public static void main(String[] args) {
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);

	}

}
