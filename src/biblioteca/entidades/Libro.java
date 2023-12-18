package biblioteca.entidades;

public class Libro {

    private String titulo;
    private String autor;
    private Integer paginas;
    private Integer disponibles;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer paginas, Integer disponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponibles = disponibles;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo);
        return sb.toString();
    }

}
