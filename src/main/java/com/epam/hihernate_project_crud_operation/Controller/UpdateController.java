package com.epam.hihernate_project_crud_operation.Controller;

import com.epam.hihernate_project_crud_operation.Dao.ProductDao;
import com.epam.hihernate_project_crud_operation.Dto.Product;

public class UpdateController {
	public static void main (String args[]) {
		ProductDao dao= new ProductDao();
		Product p=dao.updateProductNameById(103, "WhiteBoard");
		if(p!=null) {
			System.out.println("Update is successsfully");
		}else {
			System.out.println("Not Updated");
		}
		
	}

}
