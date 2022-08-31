
public class Video {
	private String videoName;
	private boolean checkout;
	private int rating;
	
	public Video(String name) {
		videoName = name;
	}
	
	public String getName() {
		 return videoName;
	}
	
	public void docheckout() {
		checkout = true;
	}
	public void doReturn() {
		checkout = false;
	}
	
	public void recieveRating(int rating) {
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}
	public boolean getcheckout() {
		return checkout;
	}

}
