package Model;

import Enums.Catogray;

public class Engineer {
    private String name;
    private String id;
    private String phone;
    private String office;
    private double percent;
    private Catogray catogray;
    private Design design;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public Catogray getCatogray() {
        return catogray;
    }

    public void setCatogray(Catogray catogray) {
        this.catogray = catogray;
    }

    public Design getDesign() {
        return design;
    }

    public void setDesign(Design design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", office='" + office + '\'' +
                ", percent=" + percent +
                ", catogray=" + catogray +
                ", design=" + design +
                '}';
    }
}
