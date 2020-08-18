package Model;

import Enums.HolidayType;

import java.util.Date;

public class Holiday {
    private Date date;
    private HolidayType holidayType;

    public Holiday() {
    }

    public Holiday(Date date, HolidayType holidayType) {
        this.date = date;
        this.holidayType = holidayType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HolidayType getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(HolidayType holidayType) {
        this.holidayType = holidayType;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "date=" + date +
                ", holidayType=" + holidayType +
                '}';
    }
}
