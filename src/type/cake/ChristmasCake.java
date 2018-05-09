package type.cake;



import basicCake.BasicCake;
import cake.cakeInterface.Christmas;

public class ChristmasCake extends BasicCake implements Christmas{

	@Override
	public void MessageOnCake() {
		System.out.println("happy christmas");
		
	}



}
