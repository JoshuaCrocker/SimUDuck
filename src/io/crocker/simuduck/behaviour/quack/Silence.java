package io.crocker.simuduck.behaviour.quack;

import io.crocker.simuduck.behaviour.QuackBehaviour;

public class Silence implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("*mute duck*");

	}

}
