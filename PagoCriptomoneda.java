public class PagoCriptomoneda extends  MedioPago {
    private String direccionWallet;
    private String redBlockchain;

    public PagoCriptomoneda(String direccionWallet, String redBlockchain, String titular, String moneda) {
        super(titular, moneda);
        this.direccionWallet = direccionWallet;
        this.redBlockchain = redBlockchain;
    }

    @Override
    public void procesarCobro(double monto) {
        System.out.println("pago con criptomoneda");
        System.out.println("titular: " + titular);
        System.out.println("monto: " + monto + moneda);
        System.out.println("wallet: " + direccionWallet);
        System.out.println("red: " + redBlockchain);
        System.out.println("transaccion confirmada");
    }
}