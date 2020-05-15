package com.beans;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Student {
	int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
