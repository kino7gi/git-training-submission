package hero;

public class Matango_main {

	public static void main(String[] args) {
		hero.main.Hero h = new hero.main.Hero();
	    h.name = "ミナト";
	    h.hp = 100;

	    Matango_logic m1 = new Matango_logic();
	    m1.hp = 50;
	    m1.suffix = 'A';

	    Matango_logic m2 = new  Matango_logic();
	    m2.hp = 48;
	    m2.suffix = 'B';

	    // 冒険のはじまり
	    h.slip();
	    m1.run();
	    m2.run();
	    h.run();

	}

}
