package ServicesImpl;

import DAO.DesginDao;
import DAO.EngineerDao;
import Model.*;
import Services.EngineerInterface;

public class EngineerInterfaceImpl implements EngineerInterface {
    @Override
    public Customer insertCustomer(Customer customer) {
        if(!EngineerDao.customers.contains(customer)){
            EngineerDao.customers.add(customer);
            System.out.println("customer had been added");
            return customer;
        }
        System.out.println("customer already found");
        return null;
    }

    @Override
    public Company insertCompany(Company company) {
        if(!EngineerDao.companies.contains(company)){
            EngineerDao.companies.add(company);
            System.out.println("company had been added");
            return company;
        }
        System.out.println("company already found");
        return null;

    }

    @Override
    public Worker insertWorker(Worker worker) {
        if(!EngineerDao.workers.contains(worker)){
            EngineerDao.workers.add(worker);
            System.out.println("worker had been added");
            return worker;
        }
        System.out.println("worker already found");
        return null;
    }

    @Override
    public int setNumbersOfWorkers() {
        return EngineerDao.workers.size();
    }

    @Override
    public Design setDesgin(Design design) {
        if(!DesginDao.designs.contains(design)){
            DesginDao.designs.add(design);
            System.out.println("Desgin had been added");
            return design;
        }
        System.out.println("found");
        return null;
    }

    @Override
    public boolean deliverTheOrder() {
        Engineer engineer=new Engineer();
        if(engineer.getPercent()!=0)return true;
        return false;
    }

    @Override
    public double calculateCoast() {
        Design design=new Design();
        return design.getArea()*200;
    }


    @Override
    public void deleteCustomer(Customer customer) {
        if(!EngineerDao.customers.contains(customer)){
            EngineerDao.customers.remove(customer);
            System.out.println("customer had been deleted");
        }
        System.out.println("customer not found");
    }

    @Override
    public void deleteCompany(Company company) {
        if(!EngineerDao.customers.contains(company)){
            EngineerDao.customers.remove(company);
            System.out.println("company had been deleted");
        }
        System.out.println("company not found");
    }

    @Override
    public void deleteWorker(Worker worker) {
        if(!EngineerDao.customers.contains(worker)){
            EngineerDao.customers.remove(worker);
            System.out.println("worker had been deleted");
        }
        System.out.println("worker not found");
    }
}
