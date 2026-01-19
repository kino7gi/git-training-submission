package ch15;
//replaceAllメソッドを使った文字列の置換
public class Main15_8 {

	public static void main(String[] args) {
		String s = "abc,def,ghi";
		String w = s.replaceAll("[beh]", "x");
		System.out.println(w);

	}

}
