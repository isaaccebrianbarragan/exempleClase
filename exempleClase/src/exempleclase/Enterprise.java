package exempleclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Isaac Cebrián Barragán
 * @version 02/10/2016
 */
public class Enterprise {
    private static EmployeeList employeeList;
    public static void main(String[] args) {
        employeeList = new EmployeeList();
        employeeList.loadData();
        boolean exit = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!exit) {
            try {
                System.out.println(menu());
                //Read user keyboard.
                switch(Integer.parseInt(br.readLine())) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        System.out.println(employeeList.toString());
                        break;
                    case 3:
                        exit = true;
                        break;
                    default:
                        System.out.println("Please put a valid number.");
                        break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Wrong value, please put a number.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
    
    /**
     * Create the menu with options to the user.
     * @return Menu.
     */
    public static String menu() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--- MENU ---");
        sb.append("\n1 - Add a new Employee.");
        sb.append("\n2 - Show All employees.");
        sb.append("\n3 - Exit.");
        sb.append("\nPut a number:");
        return sb.toString();
    }
    /**
     * Ask the user to put data of a new employee and if all data are correct, adds to the employeeList.
     */
    private static void addEmployee() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int suplementarySalary;
        try {
            System.out.println("Put the name:");
            name = br.readLine();
            if(name.length() > 2) {
                System.out.println("Put the suplementary salary:");
                suplementarySalary = Integer.parseInt(br.readLine());
                employeeList.add(new Employee(name,suplementarySalary));
            } else {
                System.out.append("Employee not created, the name must be upper than 2 letters.");
            }
        } catch(NumberFormatException e) {
                System.out.println("Employee not created, the value must be a none decimal number.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
