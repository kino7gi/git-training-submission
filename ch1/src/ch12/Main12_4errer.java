package ch12;
//Wizardにfireballを使わせる（エラー）
public class Main12_4errer {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);//この行でエラーが発生する
		

	}

}
