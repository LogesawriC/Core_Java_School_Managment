package School;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private double funds;
    
    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        funds = 0.0;
    }
    
    public void admitStudent(Student student)
    {
        students.add(student);
        System.out.println("Student admitted: " + student.getName());
        System.out.println("Studen ID :"+student.getStudentId());
        System.out.println("Student Age : "+student.getAge());
        System.out.println("*************************************");
    }
    
    public void hireTeacher(Teacher teacher)
    {
        teachers.add(teacher);
        System.out.println("Teacher hired: " + teacher.getName());
        System.out.println("Teacher ID: " + teacher.getTeacherId());
        System.out.println("-------------------------------------");
    }
    
    public void collectFees(double amount)
    {
        funds += amount;
        System.out.println("Fees collected: $" + amount);
        System.out.println("=======================================");
    }
    
    // Getters and setters for funds
    public double getFunds() 
    {
        return funds;
    }
    
    public void setFunds(double funds)
    {
        this.funds = funds;
    }
    
    // methods for managing funds, students, and teachers
  
}