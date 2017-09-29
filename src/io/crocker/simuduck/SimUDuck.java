package io.crocker.simuduck;

import io.crocker.simuduck.duck.Duck;
import io.crocker.simuduck.duck.WoodenDecoyDuck;

public class SimUDuck {

	public static void main(String[] args) {
		Duck d = new WoodenDecoyDuck();
		d.display();
		d.performQuack();
		d.performFly();
	}

}
