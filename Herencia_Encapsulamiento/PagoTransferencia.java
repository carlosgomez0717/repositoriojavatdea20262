package Paradigma_Ejercicios.Herencia_Encapsulamiento;

public class PagoTransferencia extends Pago {

    private String BancoOrigen;
    private String Numerotransaccion;

        public PagoTransferencia(double monto, String ID,String TipoPago, String bancoOrigen, String Numerotransaccion) {
        super(ID,monto,TipoPago); 
        this.BancoOrigen = bancoOrigen;
        this.Numerotransaccion = Numerotransaccion;
    }

    public PagoTransferencia(){

    }

    public PagoTransferencia(String BancoOrigen,String Numerotransaccion){
        this.BancoOrigen=BancoOrigen;
        this.Numerotransaccion=Numerotransaccion;


    }

    public String getBancoOrigen(){
        return BancoOrigen;
    }

      public void setBancoOrigen(String BancoOrigen){
        this.BancoOrigen=BancoOrigen;
    }

    public String getNumerotransaccion(){
       return Numerotransaccion;
    }

    public void setNumerotransaccion(String Numerotransaccion){
        this.Numerotransaccion=Numerotransaccion;
    }
    
}
