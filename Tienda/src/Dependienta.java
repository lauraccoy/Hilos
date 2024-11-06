public class Dependienta {
    String nombre;

    public Dependienta(String nombre) {
        this.nombre = nombre;
    }

    public void registrarCompra(Cliente cliente, long tiempoInicio) {
        System.out.println("DEPENDIENTA: " + nombre + " atendiendo a: " + cliente.nombre);

        long tiempoActual;
        for (int i = 0; i < cliente.getCompra().length; i++) {
            procesarProducto(cliente.getCompra()[i], i + 1, tiempoInicio);
        }

        // Calculamos el tiempo total después de procesar todos los productos
        tiempoActual = System.currentTimeMillis();
        System.out.println("\nCOMPRA DEL CLIENTE PROCESADA EN: " + (tiempoActual - tiempoInicio) + "ms");
    }

    // Método auxiliar para procesar cada producto
    private void procesarProducto(int tiempoProducto, int numeroProducto, long tiempoInicio) {
        try {
            Thread.sleep(tiempoProducto);  // Simulamos el tiempo de procesamiento
            long tiempoActual = System.currentTimeMillis();
            System.out.println("PRODUCTO " + numeroProducto + " pasa por caja en " + (tiempoActual - tiempoInicio) + "ms");
        } catch (InterruptedException e) {
            System.out.println("Interrupción detectada en el producto " + numeroProducto);
        }
    }
}
