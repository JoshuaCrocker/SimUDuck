package io.crocker.simuduck.duck;

import io.crocker.simuduck.behaviour.FlyBehaviour;
import io.crocker.simuduck.behaviour.QuackBehaviour;

public abstract class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public void performQuack() {
		if (this.quackBehaviour != null) {
			this.quackBehaviour.quack();
		}
	}

	public void performFly() {
		if (this.flyBehaviour != null) {
			this.flyBehaviour.fly();
		}
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void display() {
		System.out.println("I am a " + this.getClass().getSimpleName());
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
