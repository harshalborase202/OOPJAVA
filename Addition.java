class Addition {
    int a;
    int b;

    Addition() {
        this(20,30);
      System.out.println("In no argument constructor");
    }

    Addition(int a, int b) {
      this.a=a;
      this.b=b;
      System.out.println("In parameterized constructor");
     System.out.println("Addition is :" +(a+b));
    }

    public static void main(String[] args) {
        Addition s1 = new Addition();
}
}
