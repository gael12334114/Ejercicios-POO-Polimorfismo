public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("El principito");
        Audiolibro audiolibro = new Audiolibro("Don Quijote de la Mancha");

        libro.mostrarDescripcion();
        System.out.println();
        audiolibro.mostrarDescripcion();
    }
}
