public class Publicacion {
    private String titulo;
    private String anioDePublicacion;

    public Publicacion(String titulo, String anioDePublicacion) {
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnioDePublicacion(String anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public String mostrarDatos() {
        
        return "Titulo: " + titulo + ", Año de Publicación: " + anioDePublicacion;
    }
    
   
}
