package ch13.java;
//カプセル化を行う前
public class HeroBeforAfter {
	String name;
//カプセル化を行った後
private String name;
public String getName() {
	return this.name;
}
 public void setName(String name) {
	 this.name = name;
} 
}
