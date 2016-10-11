package exempleclase;

/**
 *
 * @author Isaac Cebrián Barragán
 * @version 01/10/2016
 */
public class Employee {
    private static final int basicSalary = 800;
    private String name;
    private int suplementarySalary;
    
    public Employee() {
        this.name = "";
        this.suplementarySalary = 0;
    }
    
    /**
     * Constructor with params.
     * @param name Name of the Employee.
     * @param suplementarySalary Salary in Euros.
     */
    public Employee(String name, int suplementarySalary) {
        this.name = name;
        this.suplementarySalary = suplementarySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSuplementarySalary() {
        return suplementarySalary;
    }

    public void setSuplementarySalary(int suplementarySalary) {
        this.suplementarySalary = suplementarySalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee: \n\tName=");
        sb.append(name);
        sb.append("\n\tBasic salary=");
        sb.append(basicSalary);
        sb.append("\n\tSuplementary salary=");
        sb.append(suplementarySalary);
        sb.append("\n\tBasic salary + suplementary salary=");
        sb.append(basicSalary + suplementarySalary);
        return sb.toString();
    }
    
}
