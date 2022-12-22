class Rectangle extends Shape {
    private double w, l;
    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }
    public void print(){
        System.out.println("w = " + w + " l = " + l);
    }
    @Override
    public double area() {
        return w * l;
    }
}