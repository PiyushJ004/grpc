package com.example.grpc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.example.grpc.test.GrpcRequest;
import com.example.grpc.test.GrpcResponse;
import com.example.grpc.test.GrpcServicePjGrpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class GrpcServiceTest extends GrpcServicePjGrpc.GrpcServicePjImplBase {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void grpcTest(GrpcRequest request, StreamObserver<GrpcResponse> responseObserver) {
		String name = request.getRequest();
		String greeting = "Hello, " + name + "!";

		GrpcResponse response = GrpcResponse.newBuilder().setResponse(greeting).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
		kafkaTemplate.send("grpc-topic", greeting);
	}

}
