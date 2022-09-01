package org.patterns.creational.abstractfactory.gcp;


import org.patterns.creational.abstractfactory.Instance;
import org.patterns.creational.abstractfactory.ResourceFactory;
import org.patterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMin) {
        return new GoogleCloudStorage(capMin);
    }
}
