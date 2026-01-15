package rennsyuu8;

import java.util.Random;

public class Cleric {
	String name;
	final int Max_hp = 50;
	int hp = 50;
	final int Max_mp =10;
	int mp = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.hp = Max_hp;
		this.mp -= 5;
		System.out.println(this.name + "は、HPを最大まで回復した！");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "祈るを唱えた！");
		int recover = new Random().nextInt(3) + sec ;
		//実際に回復できる量
		int recoverActual = Math.min(this.Max_mp - this.mp, recover);
		
		this.mp +=recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
	
}
