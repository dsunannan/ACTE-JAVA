package com.acte.generics;

class MyObjectType<T> {
	T obj;

	void addString(T obj) {
		this.obj = obj;
	}

	T getString() {
		return obj;
	}
}
