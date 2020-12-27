package appabs9;

import java.util.Scanner;

import abstarctionparentchild9.Student;
import abstarctionparentchild9.Hosteller;

public class appmainabs9 {
	
	public static  Hosteller gethostellerdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Id");
		int studentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Student Name");
		String name=sc.nextLine();
		System.out.println("Department ID");
		int departmentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Gender");
		String gender=sc.nextLine();
		System.out.println("phone no");
		String phno=sc.nextLine();
	
		System.out.println("Hostel name");
		String namehostel=sc.nextLine();
		System.out.println("Room number");
		int roomno=sc.nextInt();
		sc.nextLine();

		
		Hosteller hosteller=new Hosteller();
		hosteller.setDepartmentid(departmentid);
		hosteller.setGender(gender);
		hosteller.setHostelname(namehostel);
		hosteller.setName(name);
		hosteller.setPhone(phno);
		hosteller.setStudentid(studentid);
		return hosteller;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hosteller hosteller=gethostellerdetails();
		
		System.out.println("Modify room number(Y/N)");
		String modifroomno=sc.nextLine();
		if(modifroomno.equals("Y"))
		{
		System.out.println("new room no");
		int newroomno=sc.nextInt();
		sc.nextLine();
		hosteller.setRoomno(newroomno);
		}
		else if(modifroomno.equals("N"))
		{
			hosteller.getRoomno();
		}
			
		System.out.println("Modify phone no(Y/N)");
		String modifphoneno=sc.nextLine();
		if(modifphoneno.equals("Y"))
		{
			System.out.println("New Phone number");
			String newphoneno=sc.nextLine();
			hosteller.setPhone(newphoneno);
		}
		else if(modifphoneno.equals("N"))
		{
			hosteller.getPhone();
		}
		
		
	    System.out.println("The Student Details");
	    System.out.println(hosteller.getStudentid()+" "+hosteller.getName()+" "+hosteller.getDepartmentid()+" "+hosteller.getGender()+" "+hosteller.getPhone()+" "+hosteller.getHostelname()+" "+hosteller.getRoomno());
	    
		
	}

}
