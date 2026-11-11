public class PagoTarjetaDebito extends MedioPago {
    private String numeroTarjeta;
    private String claveInterbancaria;
    public PagoTarjetaDebito(String numeroTarjeta, String claveInterbancaria, String titular, String moneda) {
        super(titular, moneda);
        this.claveInterbancaria = claveInterbancaria;
        this.numeroTarjeta = numeroTarjeta;
    }
    @Override
    public void procesarCobro(double monto) {
        System.out.println("pago con tarjeta de debito");
        System.out.println("titular: " + titular);
        System.out.println("monto: " + monto + moneda);
        System.out.println("tarjeta: " + numeroTarjeta);
        System.out.println("pago aprobado");
    }
}
