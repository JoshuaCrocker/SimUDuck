package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.NoFly;
import io.crocker.simuduck.behaviour.quack.Silence;

public class WoodenDecoyDuck extends Duck {
	public WoodenDecoyDuck() {
		quackBehaviour = new Silence();
		flyBehaviour = new NoFly();
	}
}
