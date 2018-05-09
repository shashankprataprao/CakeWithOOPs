package type.cake;



import basicCake.BasicCake;
import cake.cakeInterface.Christmas;

public class ChristmasCake extends BasicCake implements Christmas{

	@Override
	public void MessageOnCake() {
		System.out.println("wish you a very happy christmas");
		
	}



}
