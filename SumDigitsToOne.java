import java.util.Scanner;

public class SumDigitsToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        
        int result = sumDigitsToOne(number);
        System.out.println("Result: " + result);
    }
    
    public static int sumDigitsToOne(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
