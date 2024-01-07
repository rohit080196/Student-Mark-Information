package Project1;

public class student {
    int rollNo ;
    String name ;
    double marks ;

    public student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetails()
    {
        System.out.println("1.ROLL NO "+ rollNo);
        System.out.println("2.NAME "+ name);
        System.out.println("3.MARKS "+ marks);
        System.out.println("-----------------");
    }
}

