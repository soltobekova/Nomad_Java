import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("вычислить от одного до тысячи: ");
        int number = input.nextInt();

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("сумма это " + sum);
    }
}
