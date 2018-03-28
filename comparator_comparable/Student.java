import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Student implements Comparable <Student>{
	protected final String name;
	protected final int studentNumber;


	public Student (String name, int studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	@Override
	public int compareTo (Student s) {

		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return this.name;
	}

	public static class StudentComparator implements Comparator<Student> {
		public int compare (Student s1, Student s2) {
			return s1.studentNumber - s2.studentNumber;
		}
	}

	public static void main (String[] args) {
		Student s1 = new Student ("deli", 2013520);
		Student s2 = new Student ("lansun", 2013540);
		Student s3 = new Student ("chencheng", 2013550);
		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		Collections.sort(studentList);
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
		System.out.println("");
		Collections.sort(studentList, new StudentComparator());
		for (Student s : studentList) {
			System.out.println(s.toString());
		}
		
	}

}