public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // For simplicity, returning a dummy customer
        return new Customer(id, "John Doe");
    }
}
