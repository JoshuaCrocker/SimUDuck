package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.fly.NoFly;
import io.crocker.simuduck.behaviour.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new NoFly();
	}
}
