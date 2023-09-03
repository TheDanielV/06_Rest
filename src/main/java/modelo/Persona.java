package modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    private int id;
    private String nombe;
    private String apellido;

    public Persona() {
    }

    public Persona(int id, String nombe, String apellido) {
        this.id = id;
        this.nombe = nombe;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
