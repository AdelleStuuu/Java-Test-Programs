public class Developer {
  String name, streetName, city, lastName, performanceReport, projectManaged;
  int salary, streetNum, age, bonus, totalSalary;

  void judgement() {
    int randName = (int) (Math.random() * 6) + 1;
    int randLastName = (int) (Math.random() * 4) + 1;
    int randSalary = (int) (Math.random() * 6) + 1;
    int randStreetNum = (int) (Math.random() * 3) + 1;
    int randStreetName = (int) (Math.random() * 3) + 1;
    int randCity = (int) (Math.random() * 3) + 1;
    int randAge = (int) (Math.random() * 3) + 1;

    if (randName == 1) {
      name = "Adelle";
    } else if (randName == 2) {
      name = "Monika";
    } else if (randName == 3) {
      name = "Celeste";
    } else if (randName == 4) {
      name = "Derick";
    } else if (randName == 5) {
      name = "Mai";
    } else if (randName == 6) {
      name = "Natasha";
    }

    if (randLastName == 1) {
      lastName = "Miller";
    } else if (randLastName == 2) {
      lastName = "Lee";
    } else if (randLastName == 3) {
      lastName = "Jones";
    } else if (randLastName == 4) {
      lastName = "Meitner";
    }

    if (randSalary == 1) {
      salary = 30000;
    } else if (randSalary == 2) {
      salary = 40000;
    } else if (randSalary == 3) {
      salary = 50000;
    } else if (randSalary == 4) {
      salary = 35000;
    } else if (randSalary == 5) {
      salary = 45000;
    } else if (randSalary == 6) {
      salary = 55000;
    }

    if (randStreetNum == 1) {
      streetNum = 123;
    } else if (randStreetNum == 2) {
      streetNum = 456;
    } else if (randStreetNum == 3) {
      streetNum = 789;
    }

    if (randStreetName == 1) {
      streetName = "Main";
    } else if (randStreetName == 2) {
      streetName = "Street";
    } else if (randStreetName == 3) {
      streetName = "Avenue";
    }

    if (randCity == 1) {
      city = "New York";
    } else if (randCity == 2) {
      city = "Los Angeles";
    } else if (randCity == 3) {
      city = "Chicago";
    }

    if (randAge == 1) {
      age = 23;
    } else if (randAge == 2) {
      age = 32;
    } else if (randAge == 3) {
      age = 37;
    }
  }

  void Description() {
    judgement();
    System.out.println("Employee Name: " + name + " " + lastName);
    System.out.println("Employee age: " + age);
    System.out.println("Employee Salary: " + salary);
    System.out.println("Address: " + streetNum + " " + streetName + ", " + city);
  }

  void workJugement() {
    int randBonus = (int) (Math.random() * 3) + 1;
    int randPerfRep = (int) (Math.random() * 3) + 1;
    int randProjRep = (int) (Math.random() * 3) + 1;

    if (randBonus == 1) {
      bonus = 5000;
    } else if (randBonus == 2) {
      bonus = 8000;
    } else if (randBonus == 3) {
      bonus = 9200;
    } 

    if (randPerfRep == 1) {
      performanceReport = "Good";
    } else if (randPerfRep == 2) {
      performanceReport = "Average";
    } else if (randPerfRep == 3) {
      performanceReport = "Bad";
    }

    if (randProjRep == 1) {
      projectManaged = "Communicating with Manager";
    } else if (randProjRep == 2) {
      projectManaged = "Implementing new Features";
    } else if (randProjRep == 3) {
      projectManaged = "Helping the Programmers";
    }

    totalSalary = salary + bonus;
  }

  void printWorkJugement() {
    workJugement();
    System.out.println("Employee Salary with bonus: " + totalSalary);
    System.out.println("Employee Performance Report: " + performanceReport);
    System.out.println("Employee Project Managed: " + projectManaged);
  }
}