public class LibroDigital extends MaterialDigital {
    public LibroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Se puede leer en pantalla");
    }
}
