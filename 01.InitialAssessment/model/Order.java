public class Order {
    private int codPedido;
    private String pedido;
    private int cantidad;
    private double precio;

    public Order (int codPedido, String pedido, int cantidad, double precio) {
        this.codPedido = codPedido;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    double calcular() {
        return cantidad * precio;
    }

    void showSummary() {
        System.out.println("Orden: " + codPedido);
        System.out.println("Producto: " + pedido);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Cantidad total: " + calcular() + " €");
    }
}
