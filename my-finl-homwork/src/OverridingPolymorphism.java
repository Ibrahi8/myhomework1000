
public class OverridingPolymorphism{
	
    public static void main(String[] args) {
        
    	Student s =new Student("Ibrahim",20);
       
    	Teacher t =new Teacher("Ibrahim Hassan",30,55000);
       
    	System.out.println(s.toString());
        System.out.println(t.toString());
    }
}
