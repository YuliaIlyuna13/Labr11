class Triangle extends Shape {
    //storony
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void print(){
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
    public double perimeter() {
        return (a+b+c);
    }
    @Override
    public double area() {
        //формула герона
        double p = perimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}