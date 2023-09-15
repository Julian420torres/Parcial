public class LibrosDeTexto extends Libros {
    private int curso;

    public LibrosDeTexto(String titulo, String autor, double precio, int curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + curso);
    }
}
    

