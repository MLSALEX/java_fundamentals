package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args) {
        Date d1 = new Date(5, 7, 2011);

        d1.setDay(4);
        d1.setMonth(12);
        d1.setYear(2023);

        d1.displayDate();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Error! Enter a valid day");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Error! Enter a valid month");
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1500 && year <= 2200) {
            this.year = year;
        } else {
            System.out.println("Error! Enter a valid year");
        }
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}