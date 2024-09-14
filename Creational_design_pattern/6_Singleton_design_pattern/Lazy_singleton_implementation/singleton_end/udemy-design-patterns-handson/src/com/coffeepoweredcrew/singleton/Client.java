package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		LazyRegistryWithDCL lazySingleton1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazySingleton2 = LazyRegistryWithDCL.getInstance();
	
		System.out.println(lazySingleton1 == lazySingleton2);    // Output: true
	}

}
