package com.epam.hihernate_project_crud_operation.Controller;

import com.epam.hihernate_project_crud_operation.Dao.ProductDao;
import com.epam.hihernate_project_crud_operation.Dto.Product;

public class GetProductById {
	public static void main(String[] args) {
		ProductDao dao= new ProductDao();
		int id =101;
		Product p=dao.getProductById(id);
		if(p!=null) {
			System.out.println(p);
		}else {
			System.out.println("Enterned Id is invalid");
		}
	}
	

}
