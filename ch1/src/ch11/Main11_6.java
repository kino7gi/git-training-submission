package ch11;
//継承の材料をnewしてしまう
public class Main11_6 {

	public static void main(String[] args) {
		Character c = new Character();
		Matango m = new Matango('A');
		c.attack(m);

	}

}
