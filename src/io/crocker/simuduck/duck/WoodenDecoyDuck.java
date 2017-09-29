package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.NoFly;
import io.crocker.simuduck.behaviour.quack.MuteDuck;

public class WoodenDecoyDuck extends Duck {
	public WoodenDecoyDuck() {
		quackBehaviour = new MuteDuck();
		flyBehaviour = new NoFly();
	}
}
