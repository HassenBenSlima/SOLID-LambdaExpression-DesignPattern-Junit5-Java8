package tn.insat.tp3;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class SimpleConsumer {

	public static void main(String[] args) throws Exception {
		
		if (args.length == 0) {
			System.out.println("Entrer le nom du topic");
			return;
		}
		
		String topicName = args[0].toString();

		Properties props = new Properties();

		props.put("bootstrap.servers", "localhost:9092");
		props.put("group.id", "test");
		props.put("enable.auto.commit", "true");
		props.put("auto.commit.interval.ms", "1000");
		props.put("session.timeout.ms", "30000");
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

		KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);

		// Kafka Consumer va souscrire a la liste de topics ici
		consumer.subscribe(Arrays.asList(topicName));

		// Afficher le nom du topic
		System.out.println("Souscris au topic " + topicName);
		int i = 0;

		while (true) {

			Duration duration = Duration.ofSeconds(5);
			Duration minusMillis = duration.minusMillis(3);

			ConsumerRecords<String, String> records = consumer.poll(minusMillis);

			for (ConsumerRecord<String, String> record : records)
				// Afficher l'offset, clef et valeur des enregistrements du consommateur
				System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
		}
	}
}
