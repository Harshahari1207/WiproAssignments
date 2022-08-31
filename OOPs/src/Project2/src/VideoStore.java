
public class VideoStore {
	private Video[] store;
	
	public int getStoresize() {
		if(store != null)
			return store.length;
		else
			return 0;
	}
	
	public Video getLastAdded() {
		if(store != null)
			return store[store.length-1];
		else
			return null;
	}
	public void addvideo(String name) {
		Video video = new Video(name);
		int storeSize;
		try {
			storeSize = store.length;
		}catch(Exception e) {
			storeSize = 0;
		}
		
		Video[] newStore = new Video[storeSize + 1];
		newStore[storeSize] = video;
		store = newStore;
	}
	public void docheckout(String name) {
		if(store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.docheckout();
			}
		}
	}
	public void doReturn(String name) {
		if(store == null || store.length == 0) {
			System.out.println("store is empty");
			return;
		}
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.doReturn();
			}
		}
	}
	public void recievRating(String name, int rating) {
		if(store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for(Video video : store) {
			if(video.getName().equals(name)) {
				video.recieveRating(rating);
			}
		}
	}
	public void listInventory() {
		if(store == null || store.length == 0) {
			System.out.print("Store is empty");
			return;
		}
		for(int i=0; i<80; i++)
			System.out.print("-");
		System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Nmae", "Rating","Checkout");
		for(int i=0; i<80; i++)
			System.out.print("-");
		for(Video video : store) {
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getRating(), video.getcheckout());
			
		}
		for(int i=0; i<80; i++)
			System.out.print("-");
	}

}
