package Paradigma_Ejercicios.Herencia_Encapsulamiento;

public class Pago {

    private String ID;
    private double Monto;
    private String TipoPago;

    public Pago(){}

     public Pago(String ID,double Monto,String TipoPago){
        this.ID=ID;
        this.Monto=Monto;
        this.TipoPago=TipoPago;

    }

    public String getID(){
        return ID;
    }

    public void SetID(String ID){

       this.ID=ID;
    }

     public double getMonto(){
        return Monto;
    }

    public void SetMonto(double Monto){

       this.Monto=Monto;
    }

     public String getTipoPago(){
        return TipoPago;
    }

    public void SetTipoPago(String TipoPago){

       this.TipoPago=TipoPago;
    }



    
}
