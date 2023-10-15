package nustLabSheetInheritance.ex4;

public class HeartRates {
    private String FirstName;
    private String LastName;
    private int day;
    private int month;
    private int year;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setDay(int day) {
        if (day >= 0 && day <= 30) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month >= 0 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public static int Age(int year)
    {
        int age = 2023 - year;
        return age;
    }

    public static int MaxHeart(int age)
    {
        int MaxBeat = 220 - age;
        return MaxBeat;
    }

    public static void TargetHeart(int beat)
    {
        int MinTarBeat = (int) (0.5 * beat);
        int MaxTarBeat = (int) (0.85 * beat);
        System.out.println(MinTarBeat +"-" + MaxTarBeat);
    }
}
