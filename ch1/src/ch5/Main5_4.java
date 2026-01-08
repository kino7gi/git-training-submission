package ch5;
//引数を一つだけ渡す
public class Main5_4 {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドび出しが終わりました");
	}
	public static void hello(String name){
		System.out.println(name + "さん、こんにちは");
	}
}
