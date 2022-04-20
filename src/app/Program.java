package app;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//Department d1 = new Department(1, "Books");
		//Seller seller = new Seller(21, "Judson Paiva", "judson@gmail.com", new Date(), 3000.0, d1);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Teste 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== Teste 2: seller findByDepartment ===");
		
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 3: seller findAll ===");
		
		list = sellerDao.findAll();
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== Teste 4: seller insert ===");
		Seller seller2 = new Seller(null, "Gregório", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(seller2);
		System.out.println("novo Id: "+seller2.getId());
		
		System.out.println("\n=== Teste 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== Teste 6: seller delete ===");
		sellerDao.deleteById(15);
		sellerDao.deleteById(16);
		System.out.println("Delete completed");
	}
}
