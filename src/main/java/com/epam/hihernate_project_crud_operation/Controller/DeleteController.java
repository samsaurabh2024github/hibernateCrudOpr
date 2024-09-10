package com.epam.hihernate_project_crud_operation.Controller;

import com.epam.hihernate_project_crud_operation.Dao.ProductDao;
//import com.epam.hihernate_project_crud_operation.Dto.Product;

public class DeleteController {
	public static void main(String[] args) {
		ProductDao dao= new ProductDao();
		
		boolean b=dao.deleteProductById(101);
		if(b==true) {
			System.out.println("Data Deleted");
		}else {
			System.out.println("Date Not Deleted");
		}
		
		}
	}
	
	


