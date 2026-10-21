public class Calculadora {

    // Método para sumar
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar
    public static int restar(int a, int b) {
        return a - b;
    }

    // NUEVO: Método para multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // NUEVO: Método para dividir (con validación básica)
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    // NUEVO: Método para calcular potencias usando la clase Math
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("--- Calculadora Básica Avanzada ---");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + sumar(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + restar(num1, num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicar(num1, num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " + dividir(num1, num2));
        System.out.println("Potencia (10 al cuadrado): " + potencia(num1, 2));
    }
}