package Task2;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;
	
	Student(){
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	
	void upYear(){
		if(this.yearInCollege >= 4){
			this.isDegree = true;
		}
		if (!isDegree) {
			this.yearInCollege++;
			System.out.printf("%s has %d years in College", this.name, this.yearInCollege);
			System.out.println();
			if(this.yearInCollege >= 4){
				this.isDegree = true;
			}
		}
		else {
			System.out.printf("%s has graduated", this.name);
			System.out.println();
		}
	}
	
	double receiveScholarship(double min, double amount){
		if(this.grade >=min && this.age <30){
			this.money +=amount;
		}
		
		return this.money;
	}
	
}
