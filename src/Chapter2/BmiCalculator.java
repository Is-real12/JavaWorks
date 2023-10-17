import java.util.Scanner;

public class BmiCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your weight in pounds: ");
double weightPounds = scanner.nextDouble();

System.out.print("Enter your height in inches: ");
double heightInches = scanner.nextDouble();

double bmi = calculateBMI(weightPounds, heightInches);
String bmiCategory = getBMICategory(bmi);

System.out.println("Your BMI is: " + bmi);
System.out.println("BMI Category: " + bmiCategory);

     
    }

public static double calculateBMI(double weightPounds, double heightInches) {
        return (weightPounds * 703) / (heightInches * heightInches);
    }

public static String getBMICategory(double bmi) {
if (bmi < 18.5) {
return "Underweight";
 } else if (bmi < 24.9) {
return "Normal weight";
} else if (bmi < 29.9) {
return "Overweight";
} else {
return "ah omo";








        }
    }
}