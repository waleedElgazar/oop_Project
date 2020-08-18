package Services;

import Model.Company;
import Model.Customer;
import Model.Engineer;
import Model.Worker;

public interface AdmistratorInterface {
    public Customer insertCustomer(Customer customer);

    public Worker insertWorker(Worker worker);

    public Company insertCompany(Company company);

    public Engineer insertEngineer(Engineer engineer);

    public boolean deleteCustomer(Customer customer);

    public boolean deleteWorker(Worker worker);

    public boolean deleteCompany(Company company);

    public boolean deleteEngineer(Engineer engineer);

    public boolean updateCustomer(Customer customer , Customer customer1);

    public boolean updateCompany(Company company, Company company1);

    public boolean updateWorker(Worker worker, Worker worker1);

    public boolean updateEngineer(Engineer engineer , Engineer engineer1);

    public boolean searchCustomer(Customer customer);

    public boolean searchCompany(Company company);

    public boolean searchWorker(Worker worker);

    public boolean searchEngineer(Engineer engineer);

}
