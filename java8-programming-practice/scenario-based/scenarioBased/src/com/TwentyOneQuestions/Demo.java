package com.TwentyOneQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(

			    new Employee("E101", "Amit", 25, "Male", "IT", 2021, 45000.0),
			    new Employee("E102", "Neha", 28, "Female", "HR", 2019, 52000.0),
			    new Employee("E103", "Rahul", 32, "Male", "Finance", 2017, 65000.0),
			    new Employee("E104", "Priya", 26, "Female", "IT", 2022, 48000.0),
			    new Employee("E105", "Suresh", 35, "Male", "Operations", 2015, 70000.0),
			    new Employee("E106", "Anjali", 29, "Female", "Marketing", 2020, 55000.0),

			    new Employee("E107", "Vikas", 41, "Male", "Management", 2012, 90000.0),
			    new Employee("E108", "Kavita", 34, "Female", "Finance", 2016, 68000.0),

			    new Employee("E109", "Rohit", 27, "Male", "Sales", 2021, 42000.0),
			    new Employee("E110", "Sneha", 24, "Female", "Sales", 2022, 38000.0),
			    new Employee("E111", "Arjun", 31, "Male", "Sales", 2018, 60000.0),

			    new Employee("E112", "Pooja", 23, "Female", "Product Development", 2023, 36000.0),
			    new Employee("E113", "Karan", 29, "Male", "Product Development", 2020, 58000.0),
			    new Employee("E114", "Meena", 27, "Female", "Product Development", 2019, 54000.0),

			    new Employee("E115", "Nitin", 45, "Male", "Operations", 2008, 95000.0),
			    new Employee("E116", "Riya", 33, "Female", "HR", 2016, 61000.0),

			    new Employee("E117", "Deepak", 38, "Male", "IT", 2014, 82000.0),
			    new Employee("E118", "Shalini", 26, "Female", "Marketing", 2021, 41000.0),

			    new Employee("E119", "Manoj", 50, "Male", "Management", 2005, 120000.0),
			    new Employee("E120", "Asha", 22, "Female", "Sales", 2024, 30000.0)
			);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("1. How many male and female employees are there in the organization ?");
		Map<String, Long> noOfEmployee = employees.stream()
		        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		noOfEmployee.forEach((gender, age) ->
		        System.out.println(gender + " : " + age));

				
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("2. Print the name of all departments in the organization ?");
		employees.stream()
				.map(Employee::getDepartment)
				.distinct()
				.forEach(System.out::println);
		
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("3. What is the average age of male and female employees ?");
		Map<String, Double> avgAge = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		
		avgAge.forEach((gender, age) ->
        System.out.println(gender + " : " + age));

		System.out.println("\n------------------------------------------------------------------");
		System.out.println("4. Get the details of highest paid employee in the organization ?");
		Employee emp = employees.stream().max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(emp);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("5. Get the names of all employees who have joined after 2015 ?");
		List<Employee> joinAfter2015 = 
				employees.stream()
				.filter(e -> e.getYearOfJoining() > 2015)
				.toList();
		joinAfter2015.forEach(System.out::println);
		
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("6. Count the number of employees in each department ?");
		Map<String, Long> empCountEachDepartment = 
				employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		empCountEachDepartment.forEach((department, count) ->
			System.out.println(department + " : " + count));
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("7. What is the average salary of each department ?");
		Map<String, Double> avgSalary = 
			employees.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,
					Collectors.averagingDouble(Employee::getSalary)));
		avgSalary.forEach((department, salary) ->
		System.out.println(department + " : " + salary));
			
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("8. Get the details of youngest male employee in the product development department ?");
		Employee youngEmp = 
				employees.stream()
				.filter(x -> x.getDepartment().equals("Product Development"))
				.min(Comparator.comparing(Employee::getAge))
				.get();
		System.out.println(youngEmp);
		
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("9. Who has the most working experience in the organization?");
		Employee mostExperience = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getYearOfJoining))
				.findFirst()
				.get();
		System.out.println(mostExperience);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("10. How many male and female employees are there in the Sales team?");
		Long empCount = 
				employees.stream()
				.filter(e -> e.getDepartment().equals("Sales"))
				.count();
		System.out.println("Sales Department Employee Count: " + empCount);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("11. What is the average salary of male and female employees ?");
		Map<String, Double> empMap = 
				employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getGender,
						Collectors.averagingDouble(Employee::getSalary)
				));
				empMap.forEach((gender, salary) -> 
				System.out.println(gender + " : " + salary));
				
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("12. List down the names of all employees in each department ?");
		List<String> empNames = 
				employees.stream()
				.map(Employee::getName)
				.toList();
		empNames.forEach(System.out::println);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("13. What is the average salary and total salary of the whole organization?");
		DoubleSummaryStatistics salary = 
				employees.stream()
				.collect(Collectors.summarizingDouble(e -> e.getSalary()));
		System.out.println("Average Salary: " + salary.getAverage());
		System.out.println("Total Salary: " + salary.getSum());
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("14. Get the employee whose salary are more than 25k.");
		List<Employee> salary25 = 
				employees.stream()
				.filter(e -> e.getSalary() > 2500)
				.toList();
		salary25.forEach(System.out::println);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("15.Who is the highest paid employee in the organization?");
		Employee highestSalary = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.findFirst()
				.get();
		System.out.println(highestSalary);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("16.Who is the second highest paid employee in the organization?");
		Employee secondHighest = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondHighest);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("17.Who is the third highest paid employee in the organization?");
		Employee thirdHighest = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(2)
				.findFirst()
				.get();
		System.out.println(thirdHighest);
		
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("18.Who is the lowest paid employee in the organization?");
		Employee lowestSalary = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.findFirst()
				.get();	
		System.out.println(lowestSalary);
		
		
		System.out.println("\n------------------------------------------------------------------");
		System.out.println("19.Who is the second lowest paid employee in the organization?");
		Employee secondLowestSalary = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.skip(1)
				.findFirst()
				.get();
		System.out.println(secondLowestSalary);
		
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("20.Get the first five lowest paid employee in the organization?");
		List<Employee> lowest5Salary = 
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.limit(5)
				.toList();
		lowest5Salary.forEach(System.out::println);
        
        
        System.out.println("\n------------------------------------------------------------------");
		System.out.println("21.Get the first five highest paid employee in the organization?");
		List<Employee> top5Salary =
				employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(5)
				.toList();
		
		top5Salary.forEach(System.out::println);	
	}

}
