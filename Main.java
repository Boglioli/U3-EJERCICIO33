public class Main {
    public static void main(String[] args) {
        MedioPago[] pagos = new MedioPago[3];
        pagos[0] = new PagoTarjetaDebito("123345667", "ABC123", "juan", "ARS");
        pagos[1] = new PagoCriptomoneda("wallet123", "ethereum", "pedro", "BTC");
        pagos[2] = new PagoBilleteraVirtual("martin.mp", 250000, "martin", "ARS");
        for (int i = 0; i < pagos.length; i++){
            pagos[i].procesarCobro(30000);
            System.out.println("-------------------");
        }
    }
}
