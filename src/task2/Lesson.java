package task2;

public class Lesson {
	String name;
	int grade = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Lesson(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Lesson [name=" + name + ", grade=" + grade + "]";
	}
	
	

	
}
