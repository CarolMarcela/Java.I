package co.com.ps;
//EL objeto es un Televisor
public class TrabajoEnClase2 {
    public static void main(String[] args) {
    }
    private  String tamano;
    private String marca;
    private String modelo;
    private String calidadDePantalla;

    public void setTamano(String tamano){
        this.tamano=tamano;
    }

    public String getTamano(){
        return this.tamano;
    }

    public void imagen() {
        System.out.println("Estoy dando imagen");
    }

    public void sonido() {
        System.out.println("Estoy dando sonido");
    }

    public void aplicaciones() {
        System.out.println("Se pueden descargar aplicaciones");
    }

}
