package ch11;

public class KyotoCleaningShop implements
	CleaningSevice{
	String ownerName;
	String address;
	String phone;
	//シャツを洗う
	public Shirt washShirt(Shert s) {
		//大型洗濯機15分
		return s;
	}
	public Towl washTowl(Towl t) {
		//大型洗濯機10分
		return t;
	}
	public Coat washCoat(Coat c) {
		//ドライ20分
		return c;
	}
	

}
