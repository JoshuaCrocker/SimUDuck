package io.crocker.simuduck;

import io.crocker.simuduck.duck.Duck;
import io.crocker.simuduck.duck.ModelDuck;

public class SimUDuck {

	public static void main(String[] args) {
		Duck d = new ModelDuck();
		d.display();
		d.performQuack();
		d.performFly();
	}

}
