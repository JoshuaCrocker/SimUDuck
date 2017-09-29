package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.NoFly;
import io.crocker.simuduck.behaviour.quack.Squeak;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehaviour = new Squeak();
		flyBehaviour = new NoFly();
	}
}
