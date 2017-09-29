package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.FlyWithWings;
import io.crocker.simuduck.behaviour.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
}
