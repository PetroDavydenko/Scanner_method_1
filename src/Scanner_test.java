import java.util.Scanner;  //import scanner

public class Scanner_test {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы вывели число " + number);
    }
}
