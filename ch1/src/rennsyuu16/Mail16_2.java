package rennsyuu16;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Mail16_2 {
	public static void main(String[]args) {
	Hero h1 = new Hero ("斎藤");//インスタンス化
	Hero h2 = new Hero ("鈴木");
	Map<Hero,Integer>heroes = new HashMap<Hero,Integer>();
	heroes.put(h1,3);
	heroes.put(h2,7);
	for(Hero key : heroes.keySet()) {
		int value = heroes.get(key);
		System.out.println(key.getName() + "が倒した敵 =" + value);
	}
	List <Hero> hero = new ArrayList<Hero>();
	hero.add(h1);
	hero.add(h2);
	for (Hero h:hero) {
		System.out.println(h.getName());
	}
}

}
