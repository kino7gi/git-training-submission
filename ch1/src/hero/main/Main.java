package hero.main;

//「神様のクラス」を作る
public class Main {
	
	public static void main(String[] args) {
		//勇者誕生
		Hero h = new Hero();
		//フィールドを初期セット
		h.name = "なぎさ";//変数hのnameに代入
		h.hp = 100;//変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		//勇者のメソッドを呼び出していく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
	}

}
