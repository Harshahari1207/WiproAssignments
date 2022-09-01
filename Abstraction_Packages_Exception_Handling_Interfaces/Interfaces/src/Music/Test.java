package Music;


import Music.String.Veena;
import Music.Wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		Playable pv, ps;
		pv = new Veena();
		ps = new Saxophone();
		
		v.play();
		s.play();
		
		pv.play();
		ps.play();

	}

}
