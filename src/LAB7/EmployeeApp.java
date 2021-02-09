package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

        //use default constructor
        Employee emp1 = new Employee();
        //assign costrustor
        Employee emp2 = new Employee("Theerapol Nuijaroen",21,"sudent",20000);


        //call displayData ()
        emp1.displayData();
        emp2.displayData();


        //System.out.println(emp2.name);

        //assign data to emp1
        emp1.setName("Theerapol Nuijaroen");
        emp1.setAge(21);
        emp1.setPosition("Dean");
        emp1.setSalary(22000);

        emp1.displayData();
        System.out.println("Emp name: "+emp1.getName());


    }//main
}//class
