package top.opendsp.ads.engine.serve;

import java.io.IOException;

import io.grpc.Grpc;
import io.grpc.Server;
import top.opendsp.ads.engine.service.BiddingServiceImpl;

public class AdsEngineApplication {

    private static Server server;

    public static void main(String[] args) {
        try {
            server = Grpc.newServerBuilderForPort(9555, null).addService(new BiddingServiceImpl()).build().start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
