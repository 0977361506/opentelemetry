package kanban.mb_tracing.configs.kafka;


import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.kafkaclients.v2_6.KafkaTelemetry;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

//    @Bean
//    public NewTopic eventRetryBlockingTopic() {
//        // Tạo topic với 2 partitions
//        return new NewTopic("event-retry-blocking-topic", 2, (short) 1);
//    }
//
//    @Bean
//    public NewTopic eventTopic() {
//        // Tạo topic với 2 partitions
//        return new NewTopic("event-topic", 2, (short) 1);
//    }
//
//    @Bean
//    public ProducerFactory<String, Event<?>> eventProducerFactory(OpenTelemetry openTelemetry) {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        // Tất cả message phải đc ghi vào các leader và follower
//        config.put(ProducerConfig.ACKS_CONFIG, "all");
//        config.put(ProducerConfig.RETRIES_CONFIG, 1);
//
//        // Instrumentation với OpenTelemetry
//        KafkaTelemetry kafkaTelemetry = KafkaTelemetry.create(openTelemetry);
//
//        // Add post-processor to monitor producer
//        DefaultKafkaProducerFactory<String, Event<?>> producerFactory = new DefaultKafkaProducerFactory<>(config);
//        producerFactory.addPostProcessor(kafkaTelemetry::wrap);
//
//        return producerFactory;
//    }
//
//    @Bean
//    public KafkaTemplate<String, Event<?>> eventKafkaTemplate(OpenTelemetry openTelemetry) {
//        KafkaTemplate<String, Event<?>> kafka = new KafkaTemplate<>(eventProducerFactory(openTelemetry));
//        return kafka;
//    }
}

