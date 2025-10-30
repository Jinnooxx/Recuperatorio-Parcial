public class Usuario implements IGestionPrestamo {
    private String nombre;
    private Publicacion[] prestamos;
    private int cantidadPrestamos;

    public Usuario(String nombre, int maxPrestamos) {
        this.nombre = nombre;
        this.prestamos = new Publicacion[maxPrestamos];
        this.cantidadPrestamos = 0;
    }

    @Override
    public void agregarPrestamo(Publicacion p) {
        if (cantidadPrestamos < prestamos.length) {
            prestamos[cantidadPrestamos] = p;
            cantidadPrestamos++;
        } else {
            System.out.println("No se pueden agregar más préstamos.");
        }
    }

    @Override
public void mostrarPrestamos() {
    System.out.println("Préstamos de " + nombre + ":");

    boolean hayPrestamos = false;

    for (int i = 0; i < cantidadPrestamos; i++) {
        Publicacion p = prestamos[i];

        if (p != null) { 
            hayPrestamos = true;
            String tipo = "";

            if (p instanceof Libro) {
                tipo = ((Libro) p).tipoPrestamo();
            } else if (p instanceof Revista) {
                tipo = ((Revista) p).tipoPrestamo();
            }

            System.out.println(" - " + p.mostrarDatos() + " → " + tipo);
        }
    }

    if (!hayPrestamos) {
        System.out.println("   No tiene préstamos registrados.");
    }
}


}
