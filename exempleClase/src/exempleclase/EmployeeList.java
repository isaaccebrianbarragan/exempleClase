package exempleclase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac Cebrián Barragán
 * @version 01/10/2016
 */
public class EmployeeList {
    //Variables
    private List<Employee> employees;

    //Constructors
    public EmployeeList() {
        this.employees = new ArrayList<>();
    }
    
    public EmployeeList(List<Employee> employee) {
        this.employees = employee;
    }
    
    //Accessors
    
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    //Methods
    
    /**
     * Adds a new employee.
     * @param name Name of the employee.
     * @param suplementarySalary  Suplementary salary of the employee.
     */
    public void add(String name, int suplementarySalary) {
        this.employees.add(new Employee(name,suplementarySalary));
    }
    
    /**
     * Adds a new employee.
     * @param e employee to add.
     */
    public void add(Employee e) {
        this.employees.add(e);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Employee employee : employees) {
            sb.append("\n");
            sb.append(employee.toString());
        }
        return sb.toString();
    }
    
    /**
     * Loads data.
     */
    public void loadData() {
        add("Isaac Cebrian Barragan", 1100);
        add("Sergio Gimenez", 1100);
        add("Marvin Josue Hernandez Lopez", 1000);
        add("Pedro Mediavilla", 1100);
        add("Erick Alberto Mendoza", 800);
        add("Ivan Colmenar Blanco", 700);
        add("Xavi Rincon Rico", 1100);
        add("Guillem Martinez Paris", 1000);
        add("Vicky Madan Sundesha", 1000);
        add("Cristian Gutierrez Espinosa", 800);
    }
    
}
