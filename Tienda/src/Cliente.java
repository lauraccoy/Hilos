public class Cliente {

    String nombre;
    int[] compra;

    public Cliente(String nombre, int[] compra) {
        this.nombre = nombre;
        this.compra = compra;
    }

    public int[] getCompra() {
        return compra;
    }

    public void setCompra(int[] compra) {
        this.compra = compra;
    }
}
