package Task2;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	StudentGroup(){
		this.freePlaces = 5;
		this.students = new Student[5];
	}
	
	StudentGroup(String subject){
		this();
		this.groupSubject = subject;
	}
	
	void addStudent(Student s){
		if(s.subject.equals(this.groupSubject) && this.freePlaces > 0){
			for (int i = 0; i < this.students.length; i++) {
				if(this.students[i] == null){
					this.students[i] = s;
					this.freePlaces--;
					break;
				}				
			}
		}		
	}
	
	void emptyGroup(){
		this.students = new Student[5];
		this.freePlaces = 5;
	}
	
	String theBestStudent(Student[] students){
		double maxGrade = 0;
		String bestStudent = "";
		for (int i = 0; i < this.students.length; i++) {
			if(this.students[i] != null && this.students[i].grade > maxGrade){
				maxGrade = this.students[i].grade;
				bestStudent = this.students[i].name;
			}
		}
		
		return bestStudent;
	}
	
	void printStudentsInGroup(Student[] s){
		for (int i = 0; i < s.length; i++) {
			if(s[i] != null){
			System.out.println("Student name: "+s[i].name+ '\n'+
			"Subject: "+s[i].subject+ '\n'+
			"Grade: "+ s[i].grade+ '\n'+
			"Year in College: "+ s[i].yearInCollege+'\n'+
			"Age: "+ s[i].age);
			
			System.out.println(s[i].isDegree ? "The student has graduated":
				"The student has not graduated");
			}
		}
	}	
	
		
}
