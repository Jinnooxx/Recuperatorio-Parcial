public class Revista extends Publicacion {
    private int numeroDeEdicion; ;

    public Revista(String titulo, String anioDePublicacion, int numeroDeEdicion) {
        super(titulo, anioDePublicacion);
        this.numeroDeEdicion = numeroDeEdicion;
    }

    public int getnumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public void setnumeroDeEdicion(int numeroDeEdicion) {
        this.numeroDeEdicion = numeroDeEdicion;
    }

    public String tipoPrestamo() {
    return "Préstamo por 7 días";
 }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", Número de Edición: " + numeroDeEdicion;
    }

}
