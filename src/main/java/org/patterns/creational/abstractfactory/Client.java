package org.patterns.creational.abstractfactory;


import org.patterns.creational.abstractfactory.aws.AwsResourceFactory;
import org.patterns.creational.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory){
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;


    }
    public static void main(String[] args) {
        Client awsClient = new Client(new GoogleResourceFactory());
        Instance server1 = awsClient.createServer(Instance.Capacity.micro, 20400);
        server1.start();
        server1.stop();

    }

}
