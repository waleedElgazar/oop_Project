package ServicesImpl;

import DAO.DesginDao;
import DAO.HolidayDao;
import DAO.Tasks;
import Model.Holiday;
import Model.WorkerTasks;
import Services.WorkerInterface;

public class WorkerInterfaceImpl implements WorkerInterface {

    @Override
    public void setHoliday(Holiday holiday) {
        HolidayDao.holidays.add(holiday);
    }

    @Override
    public WorkerTasks setTask(WorkerTasks task) {
        Tasks.workerTasks.add(task);
        return task;
    }

    @Override
    public boolean updateTask(WorkerTasks task, WorkerTasks tasks) {
        if(!Tasks.workerTasks.contains(task)){
            Tasks.workerTasks.remove(task);
            Tasks.workerTasks.add(tasks);
            System.out.println("task had been updated");
            return true;
        }
        System.out.println("not found");
        return false;
    }

    @Override
    public boolean deleteTask(WorkerTasks tasks) {
        if(!Tasks.workerTasks.contains(tasks)){
            Tasks.workerTasks.remove(tasks);
            System.out.println("task had been deleted");
            return true;
        }
        System.out.println("not found");
        return false;
    }

    @Override
    public boolean searchTask(WorkerTasks tasks) {
        return Tasks.workerTasks.contains(tasks);
    }

    @Override
    public int getHolidays() {
        return HolidayDao.holidays.size();
    }



    @Override
    public double getRating() {
        return (Tasks.list.size()/Tasks.workerTasks.size())*10;
    }


}
