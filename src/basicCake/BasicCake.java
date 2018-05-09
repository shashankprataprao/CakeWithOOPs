package basicCake;

import cake.cakeInterface.Cake;

public class BasicCake implements Cake {

	@Override
	public void bake() {
		System.out.println("bake");
		
	}

	@Override
	public void frost() {
		
		System.out.println("frost");
	}

	@Override
	public void flavour() {
		System.out.println("flavour");
		
	}

}
