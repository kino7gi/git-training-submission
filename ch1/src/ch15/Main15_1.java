package ch15;
//文字調査メソッドを利用する
public class Main15_1 {

	public static void main(String[] args) {
		String s1 = "スッキリjava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length()+ "です");
		//全角も半角も一文字としてカウント
		if(s1.isEmpty()) {//==0と書くよりも直感的に捉えやすい
			System.out.println("s1は空文字です");
		}

	}

}
