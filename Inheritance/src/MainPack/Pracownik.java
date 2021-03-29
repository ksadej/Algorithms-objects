
public class Pracownik {

	private String name;
	private String lName;
	private int age;
	
	public Pracownik(String name, String lName, int age) {
		super();
		this.name = name;
		this.lName = lName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
