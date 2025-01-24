public class Manager {
  int salaryMonthly, salaryYearly, salaryDaily;

  void SalaryCalculation() {

    int randYearly = (int) (Math.random() * 4) + 1;

    if (randYearly == 1) {
      salaryYearly = 1245000;
    } else if (randYearly == 2) {
      salaryYearly = 1512000;
    } else if (randYearly == 3) {
      salaryYearly = 1215300;
    } else if (randYearly == 4) {
      salaryYearly = 1812300;
    }

    salaryMonthly = salaryYearly / 12;
    salaryDaily = salaryMonthly / 22;

    System.out.println( "Salary per year: " + salaryYearly + " Credits" + "\nSalary per month: " + salaryMonthly + " Credits" + "\nSalary per day: " + salaryDaily + " Credits");
  }
}