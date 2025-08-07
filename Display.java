class Display {
    int a;
    int b;

    public void display() {
        this.show();
      System.out.println("In display method");
    }

   public void show() {
      System.out.println("In show method");
 
    }

    public static void main(String[] args) {
       Display s1 = new Display();
        s1.display();
}
}