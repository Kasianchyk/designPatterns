package org.patterns.creational.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH {

    private LazyRegistryIODH() {
        System.out.println("Constructor executed");
    }

    public static LazyRegistryIODH getInstance() {
        return RegistryHolder.INSTANCE;
    }

    private static class RegistryHolder {
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

}
