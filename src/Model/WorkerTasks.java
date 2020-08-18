package Model;

import DAO.Tasks;

import java.util.Date;

public class WorkerTasks {
    private String id;
    private String name;
    private Date date;
    private boolean isDone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        Tasks.list.add(1);
        isDone = done;
    }

    @Override
    public String toString() {
        return "WorkerTasks{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", isDone=" + isDone +
                '}';
    }
}

