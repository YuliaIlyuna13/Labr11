import java.io.Console;

public class MainMass {
    public static void main(String args[]) {


        Mass mas = new Mass(5);
        mas.readArray();
        mas.printArray();

        System.out.println(mas.n);
        mas.printArray();

    }
}
