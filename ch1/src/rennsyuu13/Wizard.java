package rennsyuu13;

import ch13.java.Hero;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
		
	}
	//HP
	public int getHp() {return this.hp;}
	public void setHp(int hp) {
		if(hp<0){this.hp = 0;}else{this.hp = hp;}
		}	
	//MP
	public int getMp() {return this.mp;}
	public void setMp(int mp) {
		if(mp<0) {throw new IllegalArgumentException("設定されようとしているMPが異常です");}
		this.mp = mp;
	}	
	//Name
	public String getName() {return this.name;}
	public void setWand(String name) {
		if(name == null || name.length() < 3) {throw new IllegalArgumentException("設定されようとしている名前が異常です");}
		this.name = name;
	}
	//Wand
	public Wand getWand() {return this.wand;}
	public void setWand(Wand wand) {
		if(wand == null) {throw new IllegalArgumentException("設定されようとしている杖がnullです");}
		this.wand = wand;
	}

}
