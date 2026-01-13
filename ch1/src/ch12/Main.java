package ch12;

public class Main {
//抽象クラス等はインスタンス化できないが、変数の型としては使用できる
	public static void main(String[] args) {
		Wizard w= new Wizard();
		Matango m=new Matango();
		w .name = "アサカ";
		w.attack(m);
		w.fireball(m);
		Slime s = new Slime();
		Monster m2 = new Slime();
		s.run();m2.run();

	}

}
