package Task2;

public class College {
	public static void main(String[] args) {

		Student st1 = new Student("Gosho", "Biology", 18);
		Student st2 = new Student("Pesho", "Biology", 19);
		Student st3 = new Student("Ely", "Biology", 20);
		Student st4 = new Student("Boby", "Mathematics", 18);
		Student st5 = new Student("Penka", "Mathematics", 21);

		st1.grade = 6;		
		st4.grade = 5;
		System.out.println(st1.name+" receives Scholarship "+st1.receiveScholarship(4, 500)); 
		System.out.println(st4.name+" receives Scholarship "+st4.receiveScholarship(4, 300));
		
		st3.upYear();
		
		st2.yearInCollege = 4;
		st2.upYear();
		
		StudentGroup mathGr = new StudentGroup("Mathematics");
		mathGr.addStudent(st4);
		mathGr.addStudent(st5);
		System.out.println(mathGr.groupSubject + " group:");
		mathGr.printStudentsInGroup(mathGr.students);
		System.out.println("The best student in Mathematics group is: "+
				mathGr.theBestStudent(mathGr.students));
		
		StudentGroup bioGr = new StudentGroup("Biology");
		bioGr.addStudent(st1);
		bioGr.addStudent(st2);
		bioGr.addStudent(st3);
		System.out.println("The best student in Biology group is: "+
		bioGr.theBestStudent(bioGr.students));
		
		mathGr.emptyGroup();
		System.out.println("The free places in Mathematics group now are: "+ mathGr.freePlaces);
	}
}
