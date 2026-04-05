package Assignment_14;

public class Question_5 {
    public static void main(String[] args) {


        int a = Integer.parseInt("123");
        System.out.println("Integer value: " + a);


        double b = Double.parseDouble("3.14");
        System.out.println("Double value: " + b);


        boolean c = Boolean.parseBoolean("true");
        System.out.println("Boolean value: " + c);

        String d = Integer.toBinaryString(10);
        System.out.println("Binary of 10: " + d);


        boolean e = Character.isDigit('5');
        System.out.println("Is '5' digit? " + e);


        char f = Character.toUpperCase('a');
        System.out.println("Uppercase of 'a': " + f);
    }
}
