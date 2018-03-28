import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Employee implements Comparable<Employee>{
	protected String name;
	protected int id;


	public Employee (String name, int id) {
		this.name = name;
		this.id = id;
	}


	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return name + "  " + id;
	}


	public static class IDcomparator implements Comparator<Employee> {
		public int compare(Employee e1, Employee e2) {
			int comparename = e1.name.compareTo(e2.name);
			if (comparename == 0) {
				return e1.id - e2.id;
			}
			return comparename;
			// int compareid = e1.id - e2.id;
			// if (compareid == 0) {return 0;}
			// return e1.name.compareTo(e2.name);
		}
	}


	public static void main(String[] args) {
		Employee e1 = new Employee("xiaoyu" ,  111);
		Employee e6 = new Employee("xiaoyu" ,  444);
		Employee e2 = new Employee("dingze" ,  222);
		Employee e5 = new Employee("dingze" ,  666);
		Employee e3 = new Employee("gedalao" ,  333);
		Employee e4 = new Employee("gedalao" ,  111);
		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);
		eList.add(e4);
		eList.add(e5);
		eList.add(e6);
		// Collections.sort(eList);
		// for (Employee e : eList) {
		// 	System.out.println(e.toString());
		// }

		// System.out.println("");

		Collections.sort(eList, new IDcomparator());
		for (Employee e : eList) {
			System.out.println(e.toString());
		}

	}

}