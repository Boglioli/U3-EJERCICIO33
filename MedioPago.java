public class MedioPago {
    protected String titular;
    protected String moneda;
    public MedioPago(String titular, String moneda) {
        this.titular = titular;
        this.moneda = moneda;
    }
    public void procesarCobro(double monto) {
        System.out.println("procesando pago de: " + monto + moneda);
    }
}
