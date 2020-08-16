package ServicesImpl;

import Model.Company;
import Model.Customer;
import Model.Design;
import Model.Worker;
import Services.EngineerInterface;

public class EngineerInterfaceImpl implements EngineerInterface {
    @Override
    public Customer insertCustomer(Customer customer) {
        return null;
    }

    @Override
    public Company insertCompany(Company company) {
        return null;
    }

    @Override
    public Worker insertWorker(Worker worker) {
        return null;
    }

    @Override
    public int setNumbersOfWorkers() {
        return 0;
    }

    @Override
    public Design setDesgin(Design design) {
        return null;
    }

    @Override
    public boolean deliverTheOrder() {
        return false;
    }

    @Override
    public double calculateCoast() {
        return 0;
    }

    @Override
    public double get_salary() {
        return 0;
    }

    @Override
    public void deleteCustomer() {

    }

    @Override
    public void deleteCompany() {

    }

    @Override
    public void deleteWorker() {

    }
}
