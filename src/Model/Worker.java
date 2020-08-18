package Model;

public class Worker {
    private String name;
    private String id;
    private String phone;
    private double salary;
    private String address;
    private Design design;
    private double numOfWork;

    public Worker() {
    }

    public Worker(String name, String id, String phone, double salary, String address, Design design, double numOfWork) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.salary = salary;
        this.address = address;
        this.design = design;
        this.numOfWork = numOfWork;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Design getDesign() {
        return design;
    }

    public void setDesign(Design design) {
        this.design = design;
    }

    public double getNumOfWork() {
        return numOfWork;
    }

    public void setNumOfWork(double numOfWork) {
        this.numOfWork = numOfWork;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", design=" + design +
                ", numOfWork=" + numOfWork +
                '}';
    }
}
