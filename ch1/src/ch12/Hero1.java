package ch12;
//Monsterならなんでも攻撃できるattackメソッド
public class Hero1 {
	//ざっくりモンスターならなんでも使える
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
