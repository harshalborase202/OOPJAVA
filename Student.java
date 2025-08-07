class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks) {
        this.rollno = rollno;  
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }


    public static void main(String[] args) {
        Student s1 = new Student(101, "Harshal", 90);
        s1.display();

        Student s2 = new Student(102,"Ram", 91);
        s2.display();
}
}
