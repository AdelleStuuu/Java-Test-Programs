public class Programmer {
  int salaryMonthly, salaryYearly, salaryDaily;

  void SalaryCalculation() {

    int randYearly = (int) (Math.random() * 4) + 1;

    if (randYearly == 1) {
      salaryYearly = 123000;
    } else if (randYearly == 2) {
      salaryYearly = 150000;
    } else if (randYearly == 3) {
      salaryYearly = 121200;
    } else if (randYearly == 4) {
      salaryYearly = 183030;
    }

    salaryMonthly = salaryYearly / 12;
    salaryDaily = salaryMonthly / 22;

    System.out.println( "Salary per year: " + salaryYearly + " Credits" + "\nSalary per month: " + salaryMonthly + " Credits" + "\nSalary per day: " + salaryDaily + " Credits");
  }
}