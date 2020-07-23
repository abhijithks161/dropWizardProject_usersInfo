package org.example.usersinfoproject.configuration;

import io.dropwizard.Configuration;
import lombok.Getter;

public class DBConfiguration extends Configuration {
    @Getter
    private static String mongoHost;
    @Getter
    private static Integer mongoPort;
    @Getter
    private static String mongoDbName;
}
