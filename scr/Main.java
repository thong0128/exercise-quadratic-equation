import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        QuadraticEquation qe1;
        System.out.println("QuadraticEquation: ax2 + bx + c = 0");
        System.out.print("Input a: ");
        a = input.nextDouble();
        System.out.print("Input b: ");
        b = input.nextDouble();
        System.out.print("Input c: ");
        c = input.nextDouble();
        qe1 = new QuadraticEquation(a, b, c);
        if (qe1.getDiscriminant() >= 0) {
            if (qe1.getDiscriminant() == 0)
                System.out.println("The equation has one root: " + qe1.getRoot1());
            else
                System.out.println("The equation has two root: " + qe1.getRoot1() + " and " + qe1.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
