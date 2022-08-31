import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		VideoStore store = new VideoStore();
		int choice = 0;
		
		do {
			System.out.println("\n1. Add Videos: \n" + "2. Check out Video: \n" + "3. Return Video: \n" + "4. Recieve Rating: \n" + "5. List Inventory: \n" + "6. Exit: " + "\nEnter your choice (1..6): ");
			choice = s.hasNextInt() ? s.nextInt() : 6;
			s.nextLine();
			String name;
			switch(choice) {
			case 1:
				System.out.print("Enter the name of the Video you want to add: ");
				name = s.nextLine();
				store.addvideo(name);
				System.out.println("Video " + name + " added out successfully.");
				break;
			case 2:
				System.out.print("Enter the name of Video you want to checkout: ");
				name = s.nextLine();
				store.docheckout(name);
				System.out.println("video " + name + " checked out successfully.");
				break;
			case 3:
				System.out.print("Enter the name of the video you want to Return: ");
				name = s.nextLine();
				store.doReturn(name);
				System.out.println("Video " + name + " rareturned successfully.");
				break;
			case 4:
				System.out.print("Enter the name of the video you want to Rate: ");
				name = s.nextLine();
				System.out.print("Enter the rating of this Video: ");
				int rating = s.nextInt();
				store.recievRating(name, rating);
				System.out.println("Video "+ name + "rated successfully.");
				break;
			case 5:
				store.listInventory();
				break;
			default:
					System.out.print("Exciting... !! Thanks for ussing the application.");
					break;
			}
		}while(choice != 6);
		s.close();

	}

}
