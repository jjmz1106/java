package s0623;

public class Cat {
	private String name;
	private int age;
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}	
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}