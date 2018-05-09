package basicCake;

import cake.cakeInterface.Cake;

public class BasicCake implements Cake {

	@Override
	public void bake() {
		System.out.println("in the bake function");
		
		
	}

	@Override
	public void frost() {
		
		System.out.println("in the frost function");
	}

	@Override
	public void flavour() {
		System.out.println("in the flavour function");
		
	}

}
