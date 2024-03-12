package com.example.grpc.service;

import com.example.grpc.test.GrpcServicePjGrpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.example.grpc.test.GrpcRequest;
import com.example.grpc.test.GrpcResponse;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServiceTest extends GrpcServicePjGrpc.GrpcServicePjImplBase {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void grpcTest(GrpcRequest request, StreamObserver<GrpcResponse> responseObserver) {
        String greeting = "Hello, " + request.getRequest() + "!";
        // FIXME: lets first send the message to kafka then give a response
        kafkaTemplate.send(kafkaTemplate.getDefaultTopic(), greeting)
                .handle((r, e) -> {
                            if (null == e) {
                                responseObserver.onNext(GrpcResponse.newBuilder().setResponse(r.getRecordMetadata().topic()).build());
                                responseObserver.onCompleted();
                            } else {
                                responseObserver.onError(e);
                            }
                            return true;
                        }
                ).join();
    }

}
