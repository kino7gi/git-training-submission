package ch15;
//文字列切出しメソッドを利用する
public class Main15_3 {

	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));//a programing
		System.out.println ("文字列s1も4~8文字目は、" + s1.substring(3,8));//a pro
		

	}

}
