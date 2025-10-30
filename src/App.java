

public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca("Mi Biblioteca", 100);

        Libro libro1 = new Libro("Libelula", "1605", "Juan Perez");
        Revista revista1 = new Revista("Revista de Insectos", "2021", 150);
        biblioteca.agregarPublicacion(libro1);
        biblioteca.agregarPublicacion(revista1);

        biblioteca.mostrarCatalogo();

        Publicacion resultado = biblioteca.buscarPorTitulo("Libelula");
        if (resultado != null) {
            System.out.println("Publicación encontrada: " + resultado.mostrarDatos());
        } else {
            System.out.println("Publicación no encontrada.");
        }
            biblioteca.ordenarPorAnioDesc();
            System.out.println("Catálogo ordenado por año de publicación (descendente):");
            biblioteca.mostrarCatalogo();

            IGestionPrestamo usuario = new Usuario("Matias Gil", 5);
            usuario.agregarPrestamo(libro1);    
            usuario.agregarPrestamo(revista1);
            usuario.mostrarPrestamos();
            usuario.mostrarPrestamos();


    }


}
