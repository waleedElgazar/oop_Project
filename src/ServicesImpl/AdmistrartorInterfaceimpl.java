package ServicesImpl;

import DAO.CompanyDao;
import DAO.CustomerDao;
import DAO.EngineerDao;
import DAO.WorkerDao;
import Model.Company;
import Model.Customer;
import Model.Engineer;
import Model.Worker;
import Services.AdmistratorInterface;

public class AdmistrartorInterfaceimpl implements AdmistratorInterface {

    @Override
    public Customer insertCustomer(Customer customer) {
        if(!CustomerDao.customers.contains(customer)){
            CustomerDao.customers.add(customer);
            System.out.println("customer had been added");
            return customer;
        }
        System.out.println("customer already found");
        return null;
    }

    @Override
    public Company insertCompany(Company company) {
        if(!CompanyDao.companies.contains(company)){
            CompanyDao.companies.add(company);
            System.out.println("company had been added");
            return company;
        }
        System.out.println("company already found");
        return null;

    }

    @Override
    public Engineer insertEngineer(Engineer engineer) {
        if(!EngineerDao.engineers.contains(engineer)){
            EngineerDao.engineers.add(engineer);
            System.out.println("engineer had been added");
            return engineer;
        }
        System.out.println("engineer already found");
        return null;
    }

    @Override
    public Worker insertWorker(Worker worker) {
        if(!WorkerDao.workers.contains(worker)){
            WorkerDao.workers.add(worker);
            System.out.println("worker had been added");
            return worker;
        }
        System.out.println("worker already found");
        return null;
    }
    @Override
    public boolean deleteCustomer(Customer customer) {
        if(!CustomerDao.customers.contains(customer)){
            CustomerDao.customers.remove(customer);
            System.out.println("customer had been deleted");
            return true;
        }
        System.out.println("customer not found");
        return false;
    }

    @Override
    public boolean deleteWorker(Worker worker) {
        if(!WorkerDao.workers.contains(worker)){
            WorkerDao.workers.remove(worker);
            System.out.println("worker had been deleted");
            return true;
        }
        System.out.println("worker not found");
        return false;
    }

    @Override
    public boolean deleteCompany(Company company) {
        if(!CompanyDao.companies.contains(company)){
            CompanyDao.companies.remove(company);
            System.out.println("company had been added");
            return true;
        }
        System.out.println("company not found");
        return false;
    }

    @Override
    public boolean deleteEngineer(Engineer engineer) {
        if(!EngineerDao.engineers.contains(engineer)){
            EngineerDao.engineers.remove(engineer);
            System.out.println("engineer had been deleted");
            return true;
        }
        System.out.println("engineer not found");
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer, Customer customer1) {
        if(!CustomerDao.customers.contains(customer)){
            CustomerDao.customers.remove(customer);
            CustomerDao.customers.add(customer1);
            System.out.println("customer had been updated");
            return true;
        }
        System.out.println("customer not found");
        return false;
    }

    @Override
    public boolean updateCompany(Company company, Company company1) {
        if(!CompanyDao.companies.contains(company)){
            CompanyDao.companies.remove(company);
            CompanyDao.companies.add(company1);
            System.out.println("company had been updated");
            return true;
        }
        System.out.println("company not found");
        return false;
    }

    @Override
    public boolean updateWorker(Worker worker, Worker worker1) {
        if(!WorkerDao.workers.contains(worker)){
            WorkerDao.workers.remove(worker);
            WorkerDao.workers.add(worker1);
            System.out.println("worker had been updated");
            return true;
        }
        System.out.println("worker not found");
        return false;
    }

    @Override
    public boolean updateEngineer(Engineer engineer, Engineer engineer1) {
        if(!EngineerDao.engineers.contains(engineer)){
            EngineerDao.engineers.remove(engineer);
            EngineerDao.engineers.add(engineer1);
            System.out.println("engineer had been updated");
            return true;
        }
        System.out.println("engineer not found");
        return false;
    }


    @Override
    public boolean searchCustomer(Customer customer) {
        return CustomerDao.customers.contains(customer);
    }

    @Override
    public boolean searchCompany(Company company) {
        return CompanyDao.companies.contains(company);
    }

    @Override
    public boolean searchWorker(Worker worker) {
        return WorkerDao.workers.contains(worker);
    }

    @Override
    public boolean searchEngineer(Engineer engineer) {
        return EngineerDao.engineers.contains(engineer);
    }
}
