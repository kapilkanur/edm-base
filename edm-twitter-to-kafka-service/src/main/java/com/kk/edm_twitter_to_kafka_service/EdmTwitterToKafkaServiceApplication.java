package com.kk.edm_twitter_to_kafka_service;

import com.kk.edm_twitter_to_kafka_service.config.TwitterToKafkaServiceConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdmTwitterToKafkaServiceApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(EdmTwitterToKafkaServiceApplication.class);
	private final TwitterToKafkaServiceConfiguration twitterToKafkaServiceConfiguration;

    public EdmTwitterToKafkaServiceApplication(TwitterToKafkaServiceConfiguration twitterToKafkaServiceConfiguration) {
        this.twitterToKafkaServiceConfiguration = twitterToKafkaServiceConfiguration;
    }

    public static void main(String[] args) {
		SpringApplication.run(EdmTwitterToKafkaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Application Starting");
		LOG.info(String.valueOf(twitterToKafkaServiceConfiguration.getTwitterKeywords()));
	}
}
