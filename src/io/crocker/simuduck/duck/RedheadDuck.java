package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.FlyWithWings;
import io.crocker.simuduck.behaviour.quack.Quack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
}
