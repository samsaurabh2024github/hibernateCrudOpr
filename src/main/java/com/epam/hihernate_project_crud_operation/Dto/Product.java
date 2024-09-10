package com.epam.hihernate_project_crud_operation.Dto;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private int id;
	private String name;
	private String color;
	private LocalDate mfd;
	private LocalDate expd;

}
