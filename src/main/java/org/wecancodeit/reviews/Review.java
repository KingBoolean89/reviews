package org.wecancodeit.reviews;

public class Review {

	private Long id;
	private String title;
	private String imageUrl;
	private String imageUrl2;
	private String drinkUrl;
	private String category;
	private String content;
	private String drinkType;
	private String drinkExp1;
	private String drinkExp2;

	public Review(Long id, String title, String imageUrl, String imageUrl2, String drinkUrl, String category,
			String content, String drinkType, String drinkExp1, String drinkExp2) {

		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.drinkUrl = drinkUrl;
		this.category = category;
		this.content = content;
		this.drinkType = drinkType;
		this.drinkExp1 = drinkExp1;
		this.drinkExp2 = drinkExp2;
	}

	public String getImageUrl2() {
		return imageUrl2;
	}

	public String getDrinkUrl() {
		return drinkUrl;
	}

	public String getDrinkType() {
		return drinkType;
	}

	public String getDrinkExp1() {
		return drinkExp1;
	}

	public String getDrinkExp2() {
		return drinkExp2;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}
