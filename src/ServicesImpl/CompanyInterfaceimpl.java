package ServicesImpl;

import Model.Company;
import Model.Design;
import Services.CompanyInterface;

public class CompanyInterfaceimpl  implements CompanyInterface {
    Company company=new Company();
    @Override
    public String getDesgin() {
        Design design=new Design();
        return design.toString();
    }

    @Override
    public double setCEMENTAmount() {
        return company.getAmount()/10;
    }

    @Override
    public double setIRONAmount() {
        return 0;
    }

    @Override
    public double setSAND_SLATEAmount() {
        return 0;
    }

    @Override
    public double setBRICKSAmount() {
        return 0;
    }

    @Override
    public double setCEMENTPrice() {
        return 0;
    }

    @Override
    public double setIRONPrice() {
        return 0;
    }

    @Override
    public double setSAND_SLATEPrice() {
        return 0;
    }

    @Override
    public double setBRICKSPrice() {
        return 0;
    }
}
