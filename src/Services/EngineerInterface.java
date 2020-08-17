package Services;

import Model.Company;
import Model.Customer;
import Model.Design;
import Model.Worker;

public interface EngineerInterface {

    public Customer insertCustomer(Customer customer);

    public Company insertCompany(Company company);

    public Worker insertWorker(Worker worker);

    public int setNumbersOfWorkers();

    public Design setDesgin(Design design);

    public boolean deliverTheOrder();

    public double calculateCoast();

    public void deleteCustomer();

    public void deleteCompany();

    public void deleteWorker();
}
