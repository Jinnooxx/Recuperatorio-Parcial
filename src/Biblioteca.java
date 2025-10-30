public class Biblioteca {
    private String nombre;
    private Publicacion[] catalogo;
    private int cantidad;

    public Biblioteca(String nombre, int tamanio) {
        this.nombre = nombre;
        catalogo = new Publicacion[tamanio];
        cantidad = 0;
    }

     public void agregarPublicacion(Publicacion p) {

        // Debe ser "< catalogo.length" (no "< catalogo.length - 1"), por que si no de esa forma no se puede usar el ultimo espacio del arreglo.
        if (cantidad < catalogo.length) {
            catalogo[cantidad] = p;
            cantidad++;
        } else {
            System.out.println("No hay espacio disponible");
        }
    }

    public void mostrarCatalogo() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(catalogo[i].mostrarDatos());
        }
    }

    //El error estaba en el nombre del metodo, habia escrito"ordenarPorAñoDesc" en vez de "ordenarPorAnioDesc" y aparte el año de publicacion era de tipo string, y se tuvo que convertir a entero para poder comparar. La solucion mas efectiva fue convertir el string a entero usando Integer.parseInt(). Aunque otra forma podria haber sido cambiar el tipo de dato del año de publicacion en la clase Publicacion de String a int.

    public void ordenarPorAnioDesc() {
    for (int i = 0; i < cantidad - 1; i++) {
        for (int j = 0; j < cantidad - i - 1; j++) {
            int anio1 = Integer.parseInt(catalogo[j].getAnioDePublicacion());
            int anio2 = Integer.parseInt(catalogo[j + 1].getAnioDePublicacion());
            if (anio1 < anio2) {
                Publicacion temp = catalogo[j];
                catalogo[j] = catalogo[j + 1];
                catalogo[j + 1] = temp;
            }
        }
    }
}

    //El error estaba en que tenia que cambiar getNombre por getTitulo para buscar por titulo.

    public Publicacion buscarPorTitulo(String titulo) {
        for (int i = 0; i < cantidad; i++) {
            if (catalogo[i].getTitulo().equalsIgnoreCase(titulo)) {
                return catalogo[i];
            }
        }
        return null;
    }
}
