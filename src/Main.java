class Student {

    //  private variables
    private String name;
    private int rollno;

    // setter method to set the name
    public void setName(String n) {
        this.name = n;
    }

    // getter method to retrieve the name
    public String getName() {
        return name;
    }

    // setter method to set the roll number
    public void setRollno(int r) {
        this.rollno = r;
    }

    // getter method to retrieve the roll number
    public int getRollno() {
        return rollno;
    }
}

public class Main {

    public static void main(String[] args) {
        // object of the class is created
        Student s1 = new Student();

        s1.setName("Scaler");
        s1.setRollno(27);

        // printing the value returned by getName()
        System.out.println(s1.getName());

        // printing the value returned by getRollno()
        System.out.println(s1.getRollno());
    }
}