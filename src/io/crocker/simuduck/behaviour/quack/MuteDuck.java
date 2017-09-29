package io.crocker.simuduck.behaviour.quack;

import io.crocker.simuduck.behaviour.QuackBehaviour;

public class MuteDuck implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("*mute duck*");

	}

}
