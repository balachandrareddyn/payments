package com.payments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer extends BaseEntity {

	@Column
	private String name;
	
	@Column
	private String category;
	

}
