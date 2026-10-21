package Paradigma_Ejercicios.Herencia_Encapsulamiento;

public class PagoEfectivo extends Pago{

     private double Descuento;

     public PagoEfectivo(){}
    

    public PagoEfectivo(double Descuento,String ID,String TipoPago,double Monto){
        super(ID,Monto,TipoPago);
        this.Descuento=Descuento;
    }

    public double Descuento(){

       
       return getMonto() - this.Descuento;

    }

    public double getDescuento(){
        return Descuento;
    }

    public void SetDescuento(double Descuento){
        this.Descuento=Descuento;

    }






 
}
