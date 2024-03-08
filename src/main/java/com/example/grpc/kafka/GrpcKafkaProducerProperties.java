package com.example.grpc.kafka;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "grpc.kafka.producer")
public class GrpcKafkaProducerProperties {

	private static final long serialVersionUID = 1L;
	private String bootstrapServers;
	private String keySerializer;
	private String valueSerializer;
	private String acks;
	private String retries;
	private String batchSize;
	private String bufferMemory;

}
