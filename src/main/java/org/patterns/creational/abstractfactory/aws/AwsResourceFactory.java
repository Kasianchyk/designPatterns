package org.patterns.creational.abstractfactory.aws;


import org.patterns.creational.abstractfactory.Instance;
import org.patterns.creational.abstractfactory.ResourceFactory;
import org.patterns.creational.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMin) {
        return new S3Storage(capMin);
    }
}
