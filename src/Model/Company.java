package Model;

import Enums.Catogray;

public class Company {

    private String name;
    private int id;
    private String location;
    private String phone;
    private Catogray catogray;
    private double amount;
    private double Package; //// salary of resource * amount

    public Company(){

    }
    public Company(String name, int id, String location, String phone, double aPackage) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.phone = phone;
        Package = aPackage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Catogray getCatogray() {
        return catogray;
    }

    public void setCatogray(Catogray catogray) {
        this.catogray = catogray;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPackage() {
        return Package;
    }

    public void setPackage(double aPackage) {
        Package = aPackage;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", catogray=" + catogray +
                ", amount=" + amount +
                ", Package=" + Package +
                '}';
    }
}
