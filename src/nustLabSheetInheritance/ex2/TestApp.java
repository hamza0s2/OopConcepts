package nustLabSheetInheritance.ex2;

public class TestApp
{
    public static void main(String[] args)
    {
        person person1 = new person("Muhammad Umar", "128 Ghazali I", "0334-6999032", "muhammadumarahmad111@gmail.com");
        Student student = new Student("Muhammad Mahad Nacheez", "413 Attar I", "0304-0009032", "mahadbinashfaq@gmail.com", Student.FRESHMAN);
        Employee employee = new Employee("Muhammad Ahmad", "318 Razi II", "0304-7999032", "muhammadahmadumar111@gmail.com", "101", 10000, "1/1/2022");
        Faculty faculty = new Faculty("Hafiz Muhammad Ammar", "222 Rumi III", "0335-6993233", "hafizammar1574@gmail.com", "202", 100000, "1/1/2020", "", "Professor");
        Staff staff = new Staff("Ashfaq Ijaz", "428 Hajveri", "0300-6999032", "ashfaq.ijaz@gmail.com", "303", 85000, "1/1/2021", "Secretary");
        System.out.println(person1);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
