package Model;

public class Design {
    private String id;
    private String room_number;
    private double area;
    private boolean have_garden;
    private boolean have_parking;
    private int floors;
    private boolean isAccepted;

    public Design() {
    }

    public Design(String id, String room_number, double area,  int floors ) {
        this.id = id;
        this.room_number = room_number;
        this.area = area;
        this.floors = floors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isHave_garden() {
        return have_garden;
    }

    public void setHave_garden(boolean have_garden) {
        this.have_garden = have_garden;
    }

    public boolean isHave_parking() {
        return have_parking;
    }

    public void setHave_parking(boolean have_parking) {
        this.have_parking = have_parking;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public void setAccepted(boolean accepted) {
        isAccepted = accepted;
    }

    @Override
    public String toString() {
        return "Design{" +
                "id='" + id + '\'' +
                ", room_number='" + room_number + '\'' +
                ", area='" + area + '\'' +
                ", have_garden=" + have_garden +
                ", have_parking=" + have_parking +
                ", floors=" + floors +
                ", isAccepted=" + isAccepted +
                '}';
    }
}
