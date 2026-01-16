package rennsyuu11;

public abstract class TangibleAsset1 extends Asset implements Thing{
	String color;
	double weight;
	public TangibleAsset1(String color, int price, String name, double weight) {
		super(name, price);//Assetを呼び出す。
		this.color = color;
		this.weight = weight;
	}
		public String getColor() {return this.color;}
		public double getWeight() {return this.getWeight();}
		public void setWeight(double weight) {this.weight = weight;}
	

}
