package org.patterns.creational.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry instance1 = EagerRegistry.getInstance();
		EagerRegistry instance2 = EagerRegistry.getInstance();
		System.out.println(instance1 == instance2);


		LazyRegistryWithDCL instance11 = LazyRegistryWithDCL.getINSTANCE();
		LazyRegistryWithDCL instance22 = LazyRegistryWithDCL.getINSTANCE();
		System.out.println(instance11 == instance22);


		LazyRegistryIODH instance = LazyRegistryIODH.getInstance();
		LazyRegistryIODH.getInstance();
		LazyRegistryIODH.getInstance();

	}

}
