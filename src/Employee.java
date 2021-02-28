
public abstract class Employee {
	
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	//Getters
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//Setters
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//abstracts
	public abstract int yearlySalary();
	public abstract int yearlyIncome();

}
