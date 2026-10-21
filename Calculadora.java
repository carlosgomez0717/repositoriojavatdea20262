public class Calculadora {

    // Método para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("--- Calculadora Básica ---");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + sumar(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + restar(num1, num2));
    }
}