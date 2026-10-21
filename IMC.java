import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Indice de masa cor
        Scanner scanner = new Scanner(System.in);

      // Solicitar datos al usuario
      System.out.print("Ingresa tu peso en kg: ");
      double peso = scanner.nextDouble();

      System.out.print("Ingresa tu estatura en metros (ej. 1.75): ");
      double estatura = scanner.nextDouble();

      // Calcular el IMC: peso / (estatura ^ 2)
      double imc = peso / (estatura * estatura);

      // Mostrar resultado del cálculo
      System.out.printf("\nTu IMC es: %.2f\n", imc);

      // Clasificación según la OMS
      if (imc < 18.5) {
         System.out.println("Clasificación: Bajo peso");
      } else if (imc >= 18.5 && imc <= 24.9) {
         System.out.println("Clasificación: Peso normal o saludable");
      } else if (imc >= 25.0 && imc <= 29.9) {
         System.out.println("Clasificación: Sobrepeso");
      } else {
         System.out.println("Clasificación: Obesidad (dividida en grados I, II y III)");
      }
    }
}
