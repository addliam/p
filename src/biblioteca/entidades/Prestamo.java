package biblioteca.entidades;

import java.time.LocalDate;

public class Prestamo {
    Libro libro;
    String dni;
    LocalDate fechaInicio;
    LocalDate fechaEntrega;

    public Prestamo() {
    }
    
    public Prestamo(Libro libro, String dni, LocalDate fechaInicio, LocalDate fechaEntrega) {
        this.libro = libro;
        this.dni = dni;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
    }

    
    
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prestamo{");
        sb.append("libro=").append(libro);
        sb.append(", dni=").append(dni);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaEntrega=").append(fechaEntrega);
        sb.append("}\n");
        return sb.toString();
    }
    
    
}
