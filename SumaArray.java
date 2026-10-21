import java.util.Arrays;
import java.util.Scanner;

public class SumaArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("de que tamaño van a ser los 3 vectores");   
        int n = entrada.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] b2 = new int[n];
        int[] c = new int[n];
        System.out.println("Listas");
        System.out.println("Lista 1: "+Arrays.toString(a));
        System.out.println("Lista 2: "+Arrays.toString(b));
        System.out.println("Lista 3: "+Arrays.toString(b2));
        //agregar elementos a array a
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese el elemento "+ (i+1) + " a la lista 1 : ");
            a[i] = entrada.nextInt();
            System.out.println("Ingrese el elemento "+ (i+1) + " a la lista 2 : ");
            b[i] = entrada.nextInt();
            System.out.println("Ingrese el elemento "+ (i+1) + " a la lista 3 : ");
            b2[i] = entrada.nextInt();
        }
        System.out.println("Listas");
        System.out.println("Lista 1: "+Arrays.toString(a));
        System.out.println("Lista 2: "+Arrays.toString(b));
        System.out.println("Lista 3: "+Arrays.toString(b2));

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i] + b2[i];
        }
        System.out.println("Suma");
        System.out.println(Arrays.toString(c));

        entrada.close();
    }
    
}