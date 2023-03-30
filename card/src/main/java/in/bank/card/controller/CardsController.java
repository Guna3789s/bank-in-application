package in.bank.card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.bank.card.model.Cards;
import in.bank.card.model.Customer;
import in.bank.card.repository.CardsRepository;


@RestController
public class CardsController {
	
	@Autowired
	private CardsRepository cardsRepository;
	
	@PostMapping("/cards")
	public List<Cards> getCardDetails(@RequestBody Customer customer){
		List<Cards> card =cardsRepository.findByCustomerId(customer.getCustomerId());
		return card;
		
		
	}
	

}
