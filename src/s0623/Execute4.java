package s0623;

public class Execute4 {
	
	public static void main(String[] args) {
		Cat[] cats = new Cat[20];
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();
			cats[i].setName("동동이" + i);
			cats[i].setAge(i);
		}

		
		for(Cat cat:cats) {           //for(int i=0;i<cats.length;i++)
			System.out.println(cat);  //System.out.println(cats[i]);
		}
	}

}