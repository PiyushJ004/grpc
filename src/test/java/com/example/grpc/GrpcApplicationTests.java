package com.example.grpc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.grpc.test.GrpcRequest;
import com.example.grpc.test.GrpcResponse;
import com.example.grpc.test.GrpcServicePjGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@SpringBootTest
class GrpcApplicationTests {

	@Test
	void contextLoads() {
	}

	private ManagedChannel channel;
	private GrpcServicePjGrpc.GrpcServicePjBlockingStub blockingStub;
	private KafkaProducer<String, String> producer;
	private String topic = "test-topic";

	public void setUp() {
		// Initialize gRPC channel and stub
		channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext() // For testing purposes, without
																						// encryption
				.build();
		blockingStub = GrpcServicePjGrpc.newBlockingStub(channel);

		Properties properties = new Properties();
		properties.put("bootstrap.servers", "localhost:9092");
		properties.put("key.serializer", StringSerializer.class.getName());
		properties.put("value.serializer", StringSerializer.class.getName());

		// Create Kafka producer
		producer = new KafkaProducer<>(properties);
	}

	@After
	public void tearDown() {
		// Shutdown the channel
		channel.shutdown();
	}

	@Test
	public void testGreetService() {
		// Create a request
		setUp();
		GrpcRequest request = GrpcRequest.newBuilder().setRequest("This is grpc message").build();

		// Call the service method
		GrpcResponse response = blockingStub.grpcTest(request);

		// Create a Kafka message
		ProducerRecord<String, String> record = new ProducerRecord<>(topic, response.toString());

		// Send the message to Kafka
		producer.send(record);

		// Verify the response
		assertEquals("Hello, This is grpc message!", response.getResponse());
	}

}
