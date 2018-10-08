package org.wecancodeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReviewController {
	
	private ReviewRepository reviewRepo = new ReviewRepository();
	
	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	
		
	}
	@GetMapping("/reviews/{id}") // Using a PathVariable to dynamically get student id
	public String getReview(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(reviewRepo.findOne(id));
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";

}
}
