public class DIExample {
    public static void main(String[] args) {
        // Injecting CustomerRepositoryImpl into CustomerService
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Using the service to get customer details
        Customer customer = service.getCustomer(1);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
