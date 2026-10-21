package Paradigma_Ejercicios.Herencia_Encapsulamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su id: ");
        String ID = sc.nextLine();

        System.out.println("Ingrese el monto: ");
        double monto = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese el tipo de pago (pago efectivo / tarjeta / transferencia): ");
        String TipoPago = sc.nextLine();

        if (TipoPago.equalsIgnoreCase("pago efectivo")) {
            System.out.println("Ingrese el descuento a aplicar: ");
            double Descuento = sc.nextDouble();

            PagoEfectivo pagoEfectivo = new PagoEfectivo(Descuento, ID, TipoPago, monto);
            
            System.out.println("\n--- PAGO EN EFECTIVO ---");
            System.out.println("ID: " + pagoEfectivo.getID());
            System.out.println("Total con descuento: " + pagoEfectivo.Descuento());

        } else if (TipoPago.equalsIgnoreCase("tarjeta")) {
            System.out.println("Ingrese el número de tarjeta: ");
            String NumeroTarjeta = sc.nextLine();

            PagoTarjeta pagoTarjeta = new PagoTarjeta(NumeroTarjeta, ID, TipoPago, monto);
            
            System.out.println("\n--- PAGO CON TARJETA ---");
            System.out.println("ID: " + pagoTarjeta.getID());
            System.out.println("Tarjeta: " + pagoTarjeta.getNumerotarjeta());

        } else if (TipoPago.equalsIgnoreCase("transferencia")) {
            System.out.println("Ingrese el banco de origen: ");
            String banco = sc.nextLine();
            System.out.println("Ingrese el número de transacción: ");
            String Numerotransaccion = sc.nextLine();

            // Usamos getNumeroTransaccion() con T mayúscula
            PagoTransferencia pagoTransf = new PagoTransferencia(monto, ID, TipoPago, banco, Numerotransaccion);
            
            System.out.println("\n--- PAGO POR TRANSFERENCIA ---");
            System.out.println("ID: " + pagoTransf.getID());
            System.out.println("Banco: " + pagoTransf.getBancoOrigen());
            System.out.println("Transacción: " + pagoTransf.getNumerotransaccion());

        } else {
            System.out.println("Tipo de pago no reconocido.");
        }

        sc.close();
    }
}
