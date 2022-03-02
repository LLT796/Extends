package inheritance;

/**
 * This program demonstrates inheritance.
 * @version 1.21 2022-3-2
 * @author LLT
 */

public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manager object
        var boss=new Manager("Carl Cracker",80000,1987,12,15);
        boss.setBonus(50000);

        var staff=new Employee[3];

        //fill the staff array with Manager and Employee objects

        staff[0]=boss;
        staff[1]=new Employee("Harry Hacker",50000,1989,10,1);
        staff[2]=new Employee("Tommy,Tester",40000,1990,3,15);

        //print out information about all Employee objects
        for(Employee e:staff)
            System.out.println("Name="+e.getName()+",Salary="+e.getSalary());
    }
}
