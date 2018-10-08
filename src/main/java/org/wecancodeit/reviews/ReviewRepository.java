package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		
	Review cigar1 =new Review(1L,"Partagas","smoking-886542_640","cigar-3386222_640","matthias-jordan-329907-unsplash", "Full-bodied", "Sweet fruit,with a hint of earthy robust oak.", "Scotch", "Johnnie Walker Blue Label", "12 Year old Bowmore");
	Review cigar2 =new Review(2L,"MonteCristo","smoking-886543_640","dickson-kwok-493924-unsplash","cards-2684631_640", "Medium", " Full flavored and smooth", "Bourbon", "Woodford Reserve", "Angel's Envy Cask Strength");
	Review cigar3 = new Review(3L,"Habanos","cigar-2397232_640","yucel-moran-453145-unsplash","cigar-1473699_640", "Medium or Full-bodied.", "Mild-Meduim and a hint of sweet cream.", "Cognac", "Remy Martin 1738", "Martell XO");
	
	reviews.put(1l, cigar1);
	reviews.put(2l, cigar2);
	reviews.put(3l, cigar3);
	
		
	
	}

	public int size() {

		return reviews.size();
	}

	public void add(Review review) {
		reviews.put(review.getId(), review);

	}

	public Review findOne(long id) {
		// TODO Auto-generated method stub
		return reviews.get(id);
	}

	public Collection<Review> findAll() {
		// TODO Auto-generated method stub
		return reviews.values();
	}

}
