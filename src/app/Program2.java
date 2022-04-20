package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== Teste 1: Department findById ===");
		System.out.println(departmentDao.findById(2));
		
	}

}
