package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Thomas", 900.00 );
    }


    @Test
    public void getName() {
        assertEquals("Thomas", customer.getName());
        assertNotEquals("Sydney", customer.getName());
    }


    @Test
    public void getTransaction() {
        assertEquals(900.00, customer.getTransactions().get(0), 0.0);
        assertNotEquals(150.00, customer.getTransactions().get(0), 0.0);
    }

    @Test
    public void addTransaction() {
        customer.addTransaction(300.00);
        assertEquals(2, customer.getTransactions().size());
    }
}