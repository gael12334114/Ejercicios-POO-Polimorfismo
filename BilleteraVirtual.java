public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Tipo de pago: Billetera virtual");
            System.out.println("Titular: " + getTitular());
            System.out.println("Aplicación: " + nombreAplicacion);
            System.out.println("Pago procesado por $" + monto);
        } else {
            System.out.println("Error: el monto debe ser mayor que cero.");
        }
    }
}
