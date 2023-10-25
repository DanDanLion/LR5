// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Zadanie 2
        double x = -2;
        double step = 0.2;

        System.out.println("x\tf(x)");
        while (x < 2) {
            double result = Tabl(x);
            System.out.println(x + "\t" + result);
            x += step;
        }
    }
    //Zadanie 2
        public static double Tabl(double x) {

            double y = (Math.pow(x, (x - 1)) - 1) * (Math.pow(x, (x + 1)) + 1);
            return y;
        }
}