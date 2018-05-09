package type.cake;


import basicCake.BasicCake;
import cake.cakeInterface.Wedding;

public class WeddingCake extends BasicCake implements Wedding {

	@Override
	public void Layering() {
		System.out.println("here are the layering ");
		
	}

}
