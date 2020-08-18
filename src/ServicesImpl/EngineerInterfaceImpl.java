package ServicesImpl;

import DAO.DesginDao;
import DAO.EngineerDao;
import Model.*;
import Services.EngineerInterface;

public class EngineerInterfaceImpl implements EngineerInterface {

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
    public boolean searchDesgin(Design design) {
         return  DesginDao.designs.contains(design);
    }

    @Override
    public Design updateDesgin(Design design ,Design design1) {
        if(!DesginDao.designs.contains(design)){
            DesginDao.designs.remove(design);
            DesginDao.designs.add(design1);
            System.out.println("Desgin had been updated");
            return design;
        }
        System.out.println("not found");
        return null;
    }

    @Override
    public boolean deleteDesgin(Design design) {
        if(!DesginDao.designs.contains(design)){
            DesginDao.designs.remove(design);
            System.out.println("Desgin had been deleted");
            return true;
        }
        System.out.println("not found");
        return false;
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

}
