package gt.edu.miumg.Email;

public class Archivo {
    private String nombre;
    private int peso;


    public Archivo() {
    }

    public Archivo(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Archivo{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


}
