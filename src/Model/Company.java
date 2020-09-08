package Model;

import Enums.Catogray;

public class Company {

    private String name;
    private int id;
    private String location;
    private String phone;

    public Company(){

    }
    public Company(String name, int id, String location, String phone) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.phone = phone;
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



    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
