package Introduction_to_Nashorn.Assignment2;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ScriptEngine nashron = new ScriptEngineManager().getEngineByExtension("nashron");
			nashron.eval(new FileReader("Demo.js"));
			Invocable invocable = (Invocable) nashron;
			System.out.println(invocable.invokeFunction(isPrime, 23));
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
