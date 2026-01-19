package rennsyuu13;

//StringBuilderで文字列を1万回連結させる
public class Main15_4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
		

	}

}
