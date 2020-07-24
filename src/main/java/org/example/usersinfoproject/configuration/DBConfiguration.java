package org.example.usersinfoproject.configuration;

import io.dropwizard.Configuration;

public class DBConfiguration extends Configuration {
    private static String mongoHost;
    private static Integer mongoPort;
    private static String mongoDbName;

    public static String getMongoHost() {
        return mongoHost;
    }

    public static void setMongoHost(String mongoHost) {
        DBConfiguration.mongoHost = mongoHost;
    }

    public static Integer getMongoPort() {
        return mongoPort;
    }

    public static void setMongoPort(Integer mongoPort) {
        DBConfiguration.mongoPort = mongoPort;
    }

    public static String getMongoDbName() {
        return mongoDbName;
    }

    public static void setMongoDbName(String mongoDbName) {
        DBConfiguration.mongoDbName = mongoDbName;
    }


}
