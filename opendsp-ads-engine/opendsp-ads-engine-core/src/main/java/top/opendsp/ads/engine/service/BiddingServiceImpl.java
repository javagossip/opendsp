package top.opendsp.ads.engine.service;

import io.grpc.stub.StreamObserver;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import top.opendsp.proto.rtb.OpenDspRtb.BidRequest;
import top.opendsp.proto.rtb.OpenDspRtb.BidResponse;
import top.opendsp.proto.rtb.service.BiddingServiceGrpc.BiddingServiceImplBase;

/**
 * 广告投放引擎实现
 */
public class BiddingServiceImpl extends BiddingServiceImplBase {
    private static final Logger LOGGER = LoggerFactory.getLogger("opendsp-bidder");
    @Override
    public void bid(BidRequest request, StreamObserver<BidResponse> responseObserver) {
        super.bid(request, responseObserver);
    }
}
