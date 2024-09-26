import java.math.BigDecimal;
import java.util.List;

public class RecordsIntroduction {
    public static void main(String[] args) {
        record Customer(String id, String name, String email) {
        }
        record Product(String sku, String name, BigDecimal price) {
        }
        record OrderItem(Product product, int quantity) {
            BigDecimal totalCost() {
                return product.price().multiply(BigDecimal.valueOf(quantity));
            }
        }

        record Order(String id, Customer customer, List<OrderItem> items,
                OrderStatus status) {
            enum OrderStatus {
                NEW, PROCESSING, SHIPPED, DELIVERED
            }

            BigDecimal totalPrice() {
                return items.stream()
                        .map(OrderItem::totalCost)
                        .reduce(BigDecimal.ZERO, BigDecimal::add);
            }
        }
        Customer customer = new Customer("C123", "Alice Johnson", "alice@example.com");
        List<OrderItem> orderItems = List.of(
                new OrderItem(new Product("SKU123", "Java Programming Book", new BigDecimal("29.99")), 1),
                new OrderItem(new Product("SKU456", "Wireless Mouse", new BigDecimal("15.99")), 2));
        Order order = new Order("O123", customer, orderItems, Order.OrderStatus.NEW);

        System.out.println("Processing order: " + order.id());
        System.out.println("Customer: " + order.customer().name());
        System.out.println("Total Price: $" + order.totalPrice());

        // Update order status
        Order processedOrder = new Order(order.id(), order.customer(), order.items(), Order.OrderStatus.PROCESSING);
        System.out.println("Order status updated to: " + processedOrder.status());
    }
}
