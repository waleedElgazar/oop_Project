package Controller;

import DAO.EngineerDao;
import Enums.Catogray;
import Model.*;

public class EngineerController {
    Customer customer;
    Company company;
    Engineer engineer;
    Worker worker;
    Design design;
    public void setdata(){
        customer=new Customer("waleed","5","012","birk elsab",5,1200);
        company=new Company("ezz",2,"Quesna","048",5260);
        design=new Design("12","4",250,false,true,5,false);
        engineer=new Engineer("ahmed","33","010","Quesna",10.2, Catogray.HOUSES,design);
    }

    public static void main(String[] args) {
        EngineerController engineerController=new EngineerController();
        engineerController.setdata();
    }
}
