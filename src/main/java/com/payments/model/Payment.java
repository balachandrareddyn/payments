package com.payments.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "payment")
@Data
public class Payment extends BaseEntity {

	@Column
	private Account account_id;
	@Column
	private Customer ustomerId;
	@Column
	private Long debitorAccount;
	@Column
	private Long CreditorAccount;
}
