package ch9;
import hero.main.Hero;
//Heroクラスをインスタンス化し利用する
public class Main9_1 {

	public static void main(String[] args) {
		Hero h;
	    h = new Hero();//代入文右辺が先に評価される
	    h.hp = 100;

	}

}
