package rennsyuu５;

public class Rennsyuu5_2_3 {
//属性
	public static void main(String[] args) {
		String title = "お誘い";
		String address = "SSSS@SSSS";
		String text = "今度おでかけしませんか";
		email(title,address,text);

	}
	//行動
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	//5_3問題
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	

}
