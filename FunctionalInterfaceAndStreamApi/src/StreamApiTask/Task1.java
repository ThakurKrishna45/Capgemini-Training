package StreamApiTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "Ravi", "IT", "Manager", 48, 3, 110000, 3));
        emp.add(new Employee(2, "Anjali", "HR", "HR Executive", 32, 7, 60000, 4));
        emp.add(new Employee(3, "Karan", "Finance", "Accountant", 29, 5, 55000, 3));
        emp.add(new Employee(4, "Meera", "IT", "Software Engineer", 26, 3, 75000, 5));
        emp.add(new Employee(5, "Arjun", "Sales", "Sales Executive", 35, 10, 65000, 4));
        emp.add(new Employee(6, "Priya", "Marketing", "Marketing Manager", 40, 12, 90000, 5));
        emp.add(new Employee(7, "Vikram", "IT", "DevOps Engineer", 30, 6, 80000, 4));
        emp.add(new Employee(8, "Sneha", "Finance", "Financial Analyst", 28, 4, 58000, 3));
        emp.add(new Employee(9, "Rahul", "Operations", "Operations Manager", 45, 15, 95000, 5));
        emp.add(new Employee(10, "Neha", "HR", "Recruiter", 27, 3, 50000, 4));
        emp.add(new Employee(11, "Amit", "Sales", "Manager", 38, 11, 88000, 5));
        List<String> out = emp.stream().filter(Emp -> (Emp.getJobTitle().equalsIgnoreCase("Manager") && Emp.getSalary() > 100000 && Emp.getYearsOfExperience() <= 3))
                .sorted(Comparator.comparing(Employee::getYearsOfExperience).reversed().
                        thenComparing(Employee::getPerformanceRating))
                .map(e -> new StringBuilder(e.getName())
                        .reverse()
                        .toString()
                        .toUpperCase()).collect(Collectors.toList());
        System.out.println(out);
    }

    }

