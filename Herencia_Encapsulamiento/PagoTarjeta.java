package Paradigma_Ejercicios.Herencia_Encapsulamiento;

public class PagoTarjeta extends Pago{

    private String NumeroTarjeta;

     public PagoTarjeta(){}
    

    public PagoTarjeta(String NumeroTarjeta,String ID,String TipoPago,double Monto){
        super(ID,Monto,TipoPago);
        this.NumeroTarjeta=NumeroTarjeta;
    }

    public String getNumerotarjeta(){
        return NumeroTarjeta;
    }

    public void SetDescuento(String NumeroTarjeta){
        this.NumeroTarjeta=NumeroTarjeta;

    }


    
}
