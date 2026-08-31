public class Student{
    String name;
    String id;
    int DOB;
    int age;
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "John";
        s1.id = "S123";
        s1.DOB = 2000;
        s1.age = 24;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.id = "S124";
        s2.DOB = 2001;
        s2.age = 23;

        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Date of Birth: " + s1.DOB);
        System.out.println("Age: " + s1.age);
        System.out.println();

        System.out.println("Name: " + s2.name);
        System.out.println("ID: " + s2.id);
        System.out.println("Date of Birth: " + s2.DOB);
        System.out.println("Age: " + s2.age);           
    }
}