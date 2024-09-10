package com.epam.hihernate_project_crud_operation.Dao;

import java.util.List;

import com.epam.hihernate_project_crud_operation.Dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {
	EntityManager em=Persistence.createEntityManagerFactory("jpa-hibernate-mysql").createEntityManager();
	EntityTransaction et=em.getTransaction();
	public  Product saveProductDao(Product product) {
		
		try {
			et.begin();
			em.persist(product);
			et.commit();
			return product;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Product getProductById(int productId) {
		EntityManager em=Persistence.createEntityManagerFactory("jpa-hibernate-mysql").createEntityManager();
		try {
			return em.find(Product.class,productId);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
   public boolean deleteProductById(int id) {
	   Product pr=getProductById(id);
	   if(pr!=null) {
		   try {
		   et.begin();
		   em.remove(pr);
		   et.commit();
		   return true;
	   }catch(Exception e) {
		   e.printStackTrace();
		   return false;
	   }
   }else {
	   return false;
   }
}
   public Product updateProductNameById(int id ,String name) {
	   Product p=getProductById(id);
	   if(p!=null) {
		   try {
			   p.setName(name);
			   et.begin();
			   em.merge(p);
			   et.commit();
			   return p;
		   }catch(Exception e) {
			   e.printStackTrace();return null;
		   }
	   }else {
		   return null;
	   }
   }
   @SuppressWarnings("unchecked")
public List<Product> displayAllProductById(){
	   return em.createQuery("from Product").getResultList();	   
   }
   
   
}