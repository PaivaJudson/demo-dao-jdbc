package app;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department d1 = new Department(1, "Books");
		Seller seller = new Seller(21, "Judson Paiva", "judson@gmail.com", new Date(), 3000.0, d1);
		
		System.out.println(seller);
	}

}
