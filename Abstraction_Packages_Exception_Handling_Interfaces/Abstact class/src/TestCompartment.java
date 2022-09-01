import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartment[] compartments = new Compartment[10];
		
		Random rand = new Random();
		
		for(int i=0; i<10; i++) {
			int randomNum = rand.nextInt((4-1)+1)+1;
			
			if(randomNum == 1)
				compartments[i] = new First_Class();
			else if(randomNum == 2)
				compartments[i] = new Ladies();
			else if(randomNum == 3)
				compartments[i] = new GenralClass();
			else if(randomNum == 4)
				compartments[i] = new LuggageClass();
			
			compartments[i].notice();
		}

	}

}
