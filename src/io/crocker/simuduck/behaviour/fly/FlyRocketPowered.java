package io.crocker.simuduck.behaviour.fly;

import io.crocker.simuduck.behaviour.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
