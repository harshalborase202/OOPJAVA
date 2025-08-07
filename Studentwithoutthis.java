class Studentwithoutthis {
    int rollno;
    String name;
    int marks;

    Studentwithoutthis(int rollno, String name, int marks) {
        rollno = rollno;  
        name = name;
        marks = marks;
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }


    public static void main(String[] args) {
        Studentwithoutthis s1 = new Studentwithoutthis(101, "Harshal", 90);
        s1.display();

}
}
