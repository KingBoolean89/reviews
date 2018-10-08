package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;



public class ReviewRepositoryTest {
private ReviewRepository reviewRepo = new ReviewRepository();
	
	@Test
	public void shouldAcceptStudents() {
		//Arrange
		Review review = new Review(1L, "anything", "anything", "anything", "anything", "", "", "", "", "");
		//Act
		int repoSizeBeforeAdding = reviewRepo.size();
		reviewRepo.add(review);
		int repoSizeAfterAdding = reviewRepo.size();
		//Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding )));
	}
	@Test
	public void findOneShouldReturnOneStudent() {
		Review review = new Review(1L, "anything", "anything", "anything", "anything", "", "", "", "", "");
		
		reviewRepo.add(review);
		Review result = reviewRepo.findOne(1L);
		
		assertThat(result.getTitle(), is("anything"));
	}
	
	@Test
	public void findAllShouldReturnAllStudents() {
		Review anything = new Review(6L, "anything", "anything", "anything", "anything", "", "", "", "", "");
		Review anything1 = new Review(7L, "anything", "anything", "anything", "anything", "", "", "", "", "");
		
		reviewRepo.add(anything);
		reviewRepo.add(anything1);
		
		Collection<Review> result = reviewRepo.findAll();
		
		assertThat(result, hasItems(anything, anything1));
	}
	

}
