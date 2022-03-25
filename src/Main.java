import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float x = num.nextFloat();
        float y = num.nextFloat();
        float z = num.nextFloat();
        Formula did = new Formula(x,y,z);
        did.displayFormula();
    }
}
