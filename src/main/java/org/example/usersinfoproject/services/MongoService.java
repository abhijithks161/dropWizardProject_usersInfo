package org.example.usersinfoproject.services;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import io.dropwizard.lifecycle.Managed;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.example.usersinfoproject.configuration.DBConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MongoService implements Managed {
    private static final Logger logger = LoggerFactory.getLogger(MongoService.class);

    private static MongoClient mongoClient;
    private static MongoDatabase mongoDatabase;

    public MongoDatabase getMongoDatabase() {
        try {
            if (mongoDatabase == null) {
                DBConfiguration dbConfiguration = new DBConfiguration();
                CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                        fromProviders(PojoCodecProvider.builder().automatic(true).build()));
                MongoClientOptions clientOptions = MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build();
                ServerAddress serverAddress = new ServerAddress(DBConfiguration.getMongoHost(), DBConfiguration.getMongoPort());
                mongoClient = new MongoClient(serverAddress, clientOptions);
                mongoDatabase = mongoClient.getDatabase(DBConfiguration.getMongoDbName());
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return mongoDatabase;
    }


    public void start() throws Exception {
        logger.info("---------- starting MongoDB service --------");
        getMongoDatabase();
    }

    public void stop() throws Exception {
        logger.info("------- stopping MongoDB service -------------");
        mongoClient.close();
    }
}
