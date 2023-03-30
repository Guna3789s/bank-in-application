package in.bank.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.loan.model.Customer;
import in.bank.loan.model.Loan;
import in.bank.loan.repository.LoanRepository;

@RestController
public class LoanController {
	
	@Autowired
	private LoanRepository loanRepository;
	
	@PostMapping("/loans")
	public List<Loan>  getloanDetails(@RequestBody Customer customer) {
		List<Loan> loans=loanRepository.findByCustomerId(customer.getCustomerId());
		return loans;
		
	}

}
