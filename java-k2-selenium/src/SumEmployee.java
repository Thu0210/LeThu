public class SumEmployee {
  private double salary;
  private double giftSalary;

  SumEmployee(double salary, double giftSalary){
    this.salary = salary;
    this.giftSalary = giftSalary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double getGiftSalary() {
    return giftSalary;
  }

  public void setGiftSalary(double giftSalry) {
    this.giftSalary = giftSalry;
  }
  public double SumSalary(){
    double sumsalary;
    sumsalary = salary + giftSalary;
    return sumsalary;
  }
}
