package org.example.usersinfoproject.configuration;

import io.dropwizard.Configuration;
import lombok.Data;

@Data
public class DBConfiguration extends Configuration {
    private String mongoHost;
    private Integer mongoPort;
    private String mongoDbName;
}
