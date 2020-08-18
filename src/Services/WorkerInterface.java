package Services;

import Model.Holiday;
import Model.WorkerTasks;

public interface WorkerInterface {

    public void setHoliday(Holiday holiday);

    public WorkerTasks setTask(WorkerTasks task);

    public boolean updateTask(WorkerTasks task, WorkerTasks tasks);

    public boolean deleteTask(WorkerTasks tasks);

    public boolean searchTask(WorkerTasks tasks);

    public int getHolidays();

    public double getRating();


}
