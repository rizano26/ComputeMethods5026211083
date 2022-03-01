import java.util.Random;

public class ComputeMethods5026211083 {

	public double fToC(double derajatFahrenheit){
		return(5.0 / 9 * (derajatFahrenheit - 32));
	}

	public double hypotenuse(int a, int b){
		return(Math.sqrt((a * a) + (b * b)));
	}

	public int roll() {
	   Random rndm = new Random();
		int dadu1 = rndm.nextInt(6)+1;
		int dadu2 = rndm.nextInt(6)+1;
	   return(dadu1 + dadu2);
	}
}