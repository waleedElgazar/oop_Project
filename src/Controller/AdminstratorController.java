package Controller;

import DAO.WorkerDao;
import Enums.Catogray;
import Model.Customer;
import Model.Design;
import Model.Engineer;
import Model.Worker;

public class AdminstratorController {
   /* public void fillData(){
        Customer customer=new Customer("waleed","2","012","birka");
        Design design=new Design("2","5",200,false,true,6,false);
        Engineer engineer=new Engineer("ahmed","1","010","Quesna",20.5, Catogray.HOUSES,design);
        for (int i = 0; i < 6; i++) {
            Worker worker=new Worker("ahmed"+i,i+"","010"
                    ,1000,"address"+i,design,12,"carpenter");
            WorkerDao.workers.add(worker);
        }
            }
    */

    public static void main(String[] args) {
        AdminstratorController controller=new AdminstratorController();
       // controller.fillData();
        for (Worker worker : WorkerDao.workers){
            System.out.println(worker.toString());
        }
    }
}
