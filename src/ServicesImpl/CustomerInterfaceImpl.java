package ServicesImpl;

import Model.Design;
import Services.CustomerInterface;

public class CustomerInterfaceImpl implements CustomerInterface {

    @Override
    public boolean isPaid() {
        Design design=new Design();
        return design.isAccepted();
    }


    @Override
    public boolean desginAccepted() {
        Design design=new Design();
        return design.isAccepted();
    }


}
