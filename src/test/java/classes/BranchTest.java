package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
        branch = new Branch("Texas");
        branch.newCustomer("Austin", 400.00);
    }

    @Test
    public void getName() {
        assertEquals("Texas", branch.getName());
        assertNotEquals("Adelaide", branch.getName());
    }


    @Test
    public void getCustomers() {
        assertEquals("Austin", branch.getCustomers().get(0).getName());
        assertNotEquals("Robert", branch.getCustomers().get(0));
    }


    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Victor", 300.00));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("Austin",400.00));
        assertFalse(branch.addCustomerTransaction("Simon",700.00));
    }
}