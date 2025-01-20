import java.util.Scanner;

public class WeightOnMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight on Earth (in kg): ");
        double weightOnEarth = scanner.nextDouble();
        
        double weightOnMoon = weightOnEarth * 0.165;
        
        System.out.printf("Your weight on the Moon is: %.2f kg%n", weightOnMoon);
        
        scanner.close();
    }
}
.