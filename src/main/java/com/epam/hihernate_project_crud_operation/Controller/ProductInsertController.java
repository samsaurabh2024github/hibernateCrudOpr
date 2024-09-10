package com.epam.hihernate_project_crud_operation.Controller;

import java.time.LocalDate;

import com.epam.hihernate_project_crud_operation.Dao.ProductDao;
import com.epam.hihernate_project_crud_operation.Dto.Product;

public class ProductInsertController {
	public static void main(String[] args) {
		ProductDao dao =new ProductDao();
		Product product =new Product(104,"marker","red",LocalDate.parse("2022-10-03"),LocalDate.parse("2024-12-04"));
		Product p=dao.saveProductDao(product);
		if (p!=null) {
			System.out.println("Data Stored");
		}else {
			System.out.println("Data Is NOt Stored");
		}
	}

}
