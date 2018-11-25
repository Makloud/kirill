package kirill.calc;
import java.io.*;

public class Calculator {
    static double summa(double x, double y){
        return x + y;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Vvedite pervoe chislo:");
        String a1 = reader.readLine();
        System.out.print("Vvedite vtoroechislo:");
        String b1 = reader.readLine();
        System.out.print("Vvedite dejstvie (+, -, * , /):");
        String znak = reader.readLine();
        Integer a = Integer.parseInt(a1);
        Integer b = Integer.parseInt(b1);
        if ("+".equals(znak)){
            System.out.println(a+b);
        }
        else if ("*".equals(znak)){
            System.out.println(a*b);
        }
        else if ("-".equals(znak)){
            System.out.println(a-b);
        }
        else if ("/".equals(znak)){
            System.out.println(a/b);
        }
        else{
            System.out.println("Chto-to poshlo ne tek...");
        }

    }
}
