package ch11;
//11章をまとめて記述
public class Hero extends Character{
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10のダメージをあたえた！");
		m.hp -= 10;
	}

}
