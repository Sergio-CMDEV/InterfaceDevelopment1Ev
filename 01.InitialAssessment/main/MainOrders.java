package main;

public class MainOrders {
    public static void main(String[] args) {
        Order o1 = new Order("O001", "teclado", 3, 49.99);
        Order o2 = new Order("O002", "raton", 2, 35.50);
        Order o3 = new Order("O003", "Monitor", 1, 179.90);
        o1.showSummary();
        o2.showSummary();
        o3.showSummary();
        double totalGlobal = o1.calcular() + o2.calcular() + o3.calcular();

        System.out.println("total: " + totalGlobal + " €");
    }
}
