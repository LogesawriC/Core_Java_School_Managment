package School;

public class Main {
    public static void main(String[] args) {
        // Create a school instance
        School school = new School();
        
        // Create students
        Student student1 = new Student("John Smith", 15, 1);
        Student student2 = new Student("Alice Johnson", 16, 2);
        
        // Admit students to the school
        school.admitStudent(student1);
        school.admitStudent(student2);
        
        // Create teachers
        Teacher teacher1 = new Teacher("Jane Doe", 35, 1001);
        Teacher teacher2 = new Teacher("Praveen", 40, 1002);
        
        // Hire teachers in the school
        school.hireTeacher(teacher1);
        school.hireTeacher(teacher2);
        
        // Collect fees for the school
        school.collectFees(500.0);
        school.collectFees(500.0);
        
        // Display the total funds available in the school
        System.out.println("Total funds: $" + school.getFunds());
    }
}
	