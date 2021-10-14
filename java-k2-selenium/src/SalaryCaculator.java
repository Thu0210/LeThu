import java.util.ArrayList;
import java.util.List;

public class SalaryCaculator {
  public static void main(String[] args) {
    CEO ceo = new CEO();
    Manager manager = new Manager();
    NormalEmployee normalEmployee1 = new NormalEmployee();
    NormalEmployee normalEmployee2 = new NormalEmployee();

    double totalSalary;
    totalSalary = ceo.SumSalary() + manager.SumSalary() + normalEmployee1.SumSalary() + normalEmployee2.SumSalary();
    System.out.println("Total salary: " + totalSalary);
  }
}
