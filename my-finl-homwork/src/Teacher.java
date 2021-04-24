
public class Teacher  extends Student{
    public int salary;
    Teacher(String name,int age,int salary){
        super(name,age);
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Teacher's name "+name+" age "+age+" salary "+salary;
    }
}
