public class PruebaMain {
    public static void main(String[] args) {
        Libros libro1 = new Libros("Las almas muertas" + 
                "", "nicolai golgol", 25.99);
        libro1.mostrarInformacion();

        LibrosDeTexto libroTexto1 = new LibrosDeTexto("Matemáticas Avanzadas", "Juan Pérez", 49.99, 5);
        libroTexto1.mostrarInformacion();

        LibroDeTextoInstitucionalAntonioJoseCamacho libroTextoInst = new LibroDeTextoInstitucionalAntonioJoseCamacho("Biología Celular", "Ana López", 39.99, 3, "Ciencias Naturales");
        libroTextoInst.mostrarInformacion();

        Novelas novela1 = new Novelas("Cien años de soledad", "Gabriel García Márquez", 19.99, "Realista");
        novela1.mostrarInformacion();
    }
} 


