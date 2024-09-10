package com.epam.hihernate_project_crud_operation.Controller;

import java.util.List;

import com.epam.hihernate_project_crud_operation.Dao.ProductDao;
import com.epam.hihernate_project_crud_operation.Dto.Product;

public class DisplayAllProductController {
	public static void main (String args[]) {
		ProductDao dao=new ProductDao();
		List<Product> products=dao.displayAllProductById();
		for(Product product:products) {
			System.out.println(products);
			
		}
		
		
	}

}
