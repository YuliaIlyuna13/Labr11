import java.lang.Math;
public class Main {
    public static void main(String args[]) {
        Triangle tr = new Triangle(2, 2, 2);
        tr.print();
        System.out.println(tr.perimeter());
        System.out.println("Площадь треугольника = " + tr.area());
        System.out.println();
        Rectangle rec = new Rectangle(10, 10);
        System.out.println("Площадь прямоугольника = " + rec.area());
    }
}