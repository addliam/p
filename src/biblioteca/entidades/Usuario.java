package biblioteca.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String dni;
    private List<Prestamo> historial;

    public Usuario() {
        historial = new ArrayList<>();
    }
    public Usuario(String nombre, String dni, List<Prestamo> historial) {
        this.nombre = nombre;
        this.dni = dni;
        this.historial = historial;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Prestamo> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Prestamo> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DNI: ")
                .append(dni)
                .append(" - ")                
                .append(nombre)
                .append("\n");
        return sb.toString();
    }
    
    
}
