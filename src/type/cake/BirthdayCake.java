package type.cake;


import basicCake.BasicCake;
import cake.cakeInterface.Birthday;

public class BirthdayCake extends BasicCake implements Birthday{

	@Override
	public void CandlesOnCake() {
		System.out.println("candles on bDay cake");
		
	}



}
