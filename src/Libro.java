public class Libro extends Publicacion {

    private String autor;

    public Libro(String titulo, String anioDePublicacion, String autor) {
        super(titulo, anioDePublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String tipoPrestamo() {
    return "Préstamo por 15 días";
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", Autor: " + autor;
    }

}
