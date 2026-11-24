public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Juan Perez", "1234");
        BilleteraVirtual billetera = new BilleteraVirtual("Maria Gomez", "Mercado Pago");

        tarjeta.procesarPago(15000.0);
        System.out.println();
        billetera.procesarPago(8500.0);

        // Prueba de validación: el monto negativo debe rechazarse.
        System.out.println();
        tarjeta.procesarPago(-500.0);
    }
}
