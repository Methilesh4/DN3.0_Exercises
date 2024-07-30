public class EcommerceOrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("1001", "Alice", 250.50),
                new Order("1002", "Bob", 150.00),
                new Order("1003", "Charlie", 320.75),
                new Order("1004", "Diana", 75.20),
                new Order("1005", "Eve", 200.00)
        };

        System.out.println("Orders before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        SortingAlgorithms.bubbleSort(orders);

        System.out.println("\nOrders after Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[] {
                new Order("1001", "Alice", 250.50),
                new Order("1002", "Bob", 150.00),
                new Order("1003", "Charlie", 320.75),
                new Order("1004", "Diana", 75.20),
                new Order("1005", "Eve", 200.00)
        };

        System.out.println("\nOrders before Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nOrders after Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
