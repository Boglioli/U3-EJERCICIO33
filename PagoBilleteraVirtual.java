public class PagoBilleteraVirtual extends MedioPago {
    private String alias;
    private double limiteDiario;
    public PagoBilleteraVirtual(String alias, double limiteDiario, String titular, String moneda) {
        super(titular, moneda);
        this.alias = alias;
        this.limiteDiario = limiteDiario;
    }
    @Override
    public void procesarCobro(double monto) {
        System.out.println("pago con billetera virtual");
        System.out.println("titular: " + titular);
        System.out.println("monto: " + monto + moneda);
        System.out.println("alias: " + alias);
        if (monto <= limiteDiario) {
            System.out.println("pago aprobado");
        } else {
            System.out.println("limite diario superado");
        }
    }
}
