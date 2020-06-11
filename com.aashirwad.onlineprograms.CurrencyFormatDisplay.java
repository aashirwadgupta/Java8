import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatDisplay {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner("12324.134");
        double payment = scanner.nextDouble();
        scanner.close();

        
        NumberFormat nf_US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf_IN = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat nf_CORONA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf_FR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + nf_US.format(payment));
        System.out.println("India: " + nf_IN.format(payment));
        System.out.println("China: " + nf_CORONA.format(payment));
        System.out.println("France: " + nf_FR.format(payment));
    }
}
