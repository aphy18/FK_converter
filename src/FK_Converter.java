import java.util.Scanner;
import java.text.DecimalFormat;

public class FK_Converter {
    public static void main(String[] args) {
        Scanner scanTemperature = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.##");

        System.out.println("Enter a temperature.");
        double temperature = scanTemperature.nextDouble();
        double convertToKelvin = (((temperature - 32) * 5) / 9) + 273.15;
        System.out.println("temperature from Fareinheit to Kelvin --> " + convertToKelvin);
    }
}
