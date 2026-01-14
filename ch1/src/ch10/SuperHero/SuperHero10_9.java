package ch10.SuperHero;

//親クラスのattack()を呼び出す。
public class SuperHero10_9 extends Hero{
	//
	boolean flying;
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying == true) {
			super.attack(m);
		}
	}
	

}
