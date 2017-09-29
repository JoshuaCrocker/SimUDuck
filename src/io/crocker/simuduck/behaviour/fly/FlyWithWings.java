package io.crocker.simuduck.behaviour.fly;

import io.crocker.simuduck.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flaps wings");

	}

}

// NoFly