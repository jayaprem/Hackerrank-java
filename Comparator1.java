You are given a list of student information: ID, FirstName, and CGPA. 
Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their first name in alphabetical order. 
If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
Input:
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Output:
Ashis
Fahim
Samara
Samiha
Rumpa

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}
class Perform implements Comparator<Student>
{
    @Override
    public int compare(Student a,Student b)
    {
        if(a.getCgpa()==b.getCgpa()) 
        {
            if(a.getFname().equals(b.getFname())) return a.getId()-b.getId(); 
            else
            {
           return a.getFname().compareTo(b.getFname());
            }
        }
        else if(a.getCgpa()>b.getCgpa()) return -1;
        else return 1;
    }
}
//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		Perform p=new Perform();
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
         Collections.sort(studentList,p);
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



