package Services;

import Model.Company;
import Model.Customer;
import Model.Design;
import Model.Worker;

public interface EngineerInterface {


    public Design setDesgin(Design design);

    public boolean searchDesgin(Design design);

    public Design updateDesgin(Design design ,Design design1);

    public boolean deleteDesgin(Design design);

    public boolean deliverTheOrder();

    public double calculateCoast();
}
