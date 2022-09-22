package com.pack1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {

	public static void main(String[] args) {

		//for fetch/Read operation //
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("employeeHibernate");
		EntityManager em=emf.createEntityManager();
		Employee emp=em.find(Employee.class, 6);
		if(emp != null) {
		System.out.println("Employee Id : "+emp.getEmpId());
		System.out.println("Employee Name : "+emp.getEmpName());
		System.out.println("Employee Deparment Name : "+emp.getDeptName());
		System.out.println("Employee Deparment No : "+emp.getDeptNo());
		}
		else {
			System.out.println("there is no employee with id");
		}
	}

}
