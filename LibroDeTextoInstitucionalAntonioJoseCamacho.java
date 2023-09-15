public class LibroDeTextoInstitucionalAntonioJoseCamacho extends LibrosDeTexto {
        private String facultad;
    
        public LibroDeTextoInstitucionalAntonioJoseCamacho(String titulo, String autor, double precio, int curso, String facultad) {
            super(titulo, autor, precio, curso);
            this.facultad = facultad;
        }
    
        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Facultad: " + facultad);
        }
    }

