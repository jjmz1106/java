package s0623;

public class Person {
	private String name;
	private int age;
	private String adr;
    public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 주소: " + adr;
	}
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public String getAdr() {
    	return adr;
    }	
    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setAdr(String adr) {
    	this.adr = adr;
}

}