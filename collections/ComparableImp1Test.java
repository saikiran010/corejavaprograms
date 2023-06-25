package collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
	int id;
	String name;
	int age;

	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee1 emp) {
		if (age == emp.age)
			return 0;
		else if (age > emp.age)
			return 1;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [ Id=" + id + ", name=" + name + ", age=" + age + " ] ";
	}

}

public class ComparableImp1Test {

	public static void main(String[] args) {

		ArrayList<Employee1> emps = new ArrayList<Employee1>();
		emps.add(new Employee1(101, "Saikiran", 25));
		emps.add(new Employee1(102, "Vishnu", 32));
		emps.add(new Employee1(103, "Madhu", 22));
		emps.add(new Employee1(104, "Vijay", 20));

		Collections.sort(emps);
		for (Employee1 emp : emps)
			System.out.println(emp);
	}

}
