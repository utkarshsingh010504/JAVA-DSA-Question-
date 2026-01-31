import java.util.Scanner;
class employee {
    int empID;
    String Empname;
    int Salary;
    String Designation;

    void displayInfo() {
        System.out.println("Empolyee ID:" + empID + ",Employee Name:" + Empname + ",Salary:" + Salary + ",Designation:" + Designation);
    }
}
class Company {
    public static void main(String[] args) {
        employee employ = new employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the emoloyee Designation:");
        employ.Designation = sc.nextLine();
        System.out.println("Enter the emoloyee name:");
        employ.Empname = sc.nextLine();
        System.out.println("Enter the emoloyee ID:");
        employ.empID = sc.nextInt();
        System.out.println("Enter the emoloyee Salary:");
        employ.Salary = sc.nextInt();
        employ.displayInfo();
    }
}
