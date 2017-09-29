package io.crocker.simuduck.behaviour.fly;

import io.crocker.simuduck.behaviour.FlyBehaviour;

public class NoFly implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can't fly!");

	}

}
