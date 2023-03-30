package in.bank.card.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Cards {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="card_id")
	private int cardId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="card_number")
	private String cardNumber;
	
	@Column(name="card_type")
	private String cardType;
	
	@Column(name="expir_date")
	private Date expriDate;
	
	
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpriDate() {
		return expriDate;
	}
	public void setExpriDate(Date expriDate) {
		this.expriDate = expriDate;
	}
	
	
	
	
}
