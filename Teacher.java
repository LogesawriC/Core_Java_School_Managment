package School;
public class Teacher extends Person {
    private int teacherId;
    
    public Teacher(String name, int age, int teacherId)
    {
        super(name, age);
        this.teacherId = teacherId;
    }
    
    public int getTeacherId()
    {
        return teacherId;
    }
    
    public void setTeacherId(int teacherId) 
    {
        this.teacherId = teacherId;
    }
}