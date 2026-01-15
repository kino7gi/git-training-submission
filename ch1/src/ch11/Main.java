package ch11;
//オーバーライドを忘れたHeroクラス
public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Matango m = new Matango();
		h.attack(m);
		
	}

}
