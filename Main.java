import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        long dec_value = 0;
        char Y;
        int index_value;
        int x = 0;
        int A = 10;
        int a = 10;
        int B = 11;
        int b = 11;
        int c = 12;
        int C = 12;
        int D = 13;
        int d = 13;
        int E = 14;
        int e = 14;
        int F = 15;
        int f = 15;
        String hex_value;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a hexadecimal number:"); //asks for user input
            hex_value = scanner.next();

            if (hex_value.startsWith("0x")) {
                hex_value = hex_value.substring(2, hex_value.length());
            }

            index_value = hex_value.length() - 1;

            while (index_value >= 0) {
                dec_value += (long) (Character.getNumericValue(hex_value.charAt(index_value)) * Math.pow(16, x));
                //System.out.println (Character.getNumericValue(hex_value.charAt(index_value)));
                index_value--;
                x++;
                //System.out.println(dec_value + " " + index_value + " " + x);
                }


                System.out.println("Your number is " + dec_value + " in decimal");
            }
        }


