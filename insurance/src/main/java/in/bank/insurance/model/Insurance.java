package in.bank.insurance.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="insurance_number")
	private int insuranceNumber;
	@Column(name="customer_id")
	private int customerId;
	@Column(name="insurance_type")
	private String insuranceType;
	@Column(name="insurance_amount")
	private String insuranceAmount;
	@Column(name="due_date")
	private Date duedate;
	
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	
	

}
