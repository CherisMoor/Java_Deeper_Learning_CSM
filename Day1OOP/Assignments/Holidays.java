package Day1OOP.Assignments;

public class Holidays {
    public static void main(String[] args) {
        Holidays holiday = new Holidays();
        holiday.setDay(24);
        holiday.setMonth("December");
        holiday.setName("Cherish's Birthday");
        holiday.isAHoliday();
        holiday.statement();
        System.out.println(holiday.Name);
    }

    private String Name;
    private String Month;
    private int Day;
    private boolean isAHoliday;
    private String statement;

    Holidays() {

    }

    Holidays(String Name, String Month) {
        this.Name = Name;
        this.Month = Month;
    }

    Holidays(String Name, String Month, int Day) {
        this.Name = Name;
        this.Month = Month;
        this.Day = Day;
    }

    public String getMonth() {
        return Month;
    }

    public String getName() {
        return Name;
    }

    public int getDay() {
        return Day;
    }

    public void setMonth(String Month) {
        this.Month = Month;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public boolean isAHoliday() {
        if (isAHoliday == true) {
            System.out.println(Name + " is a holiday");
        }
        return isAHoliday;
    }

    public String statement() {
        return Month;
    }

}