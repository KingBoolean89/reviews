package org.wecancodeit.reviews;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldBeOkWhenAccessingReviews() throws Exception {

		mockMvc.perform(get("/reviews")).andExpect(status().isOk());

	}
	 @Test
	    public void shouldReturnReviewsTemplateWhenAccessingReviews() throws Exception {
	    	// Arrange
	    	mockMvc
	    	// Act
	    	.perform(get("/reviews"))
	    	// Assert
	    	.andExpect(view().name("reviews"));
	    }
	 @Test
	    public void shouldBeOkWhenAccessingReview() throws Exception { 
	        // Arrange - Grab mockMvc
	    	mockMvc
	    	// Act - Perform the Mock request to localhost:8080/students
	        .perform(get("/reviews/1"))
	        // Assert - Assert that we got back a 2xx HTTP status	
	        .andExpect(status().isOk());
	    }
	    
	    @Test
	    public void shouldReturnReviewTemplateWhenAccessingReview() throws Exception {
	    	// Arrange
	    	mockMvc
	    	// Act
	    	.perform(get("/reviews/1"))
	    	// Assert
	    	.andExpect(view().name("review"));
	    }

}
