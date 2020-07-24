package org.example.usersinfoproject.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.example.usersinfoproject.configuration.DBConfiguration;
import org.example.usersinfoproject.resources.UserResource;
import org.example.usersinfoproject.services.MongoService;

public class MainApplication extends Application<DBConfiguration> {

    public static void main(String[] args) throws Exception {
        new MainApplication().run("server", "conf.yml");
    }

    public void run(DBConfiguration dbConfiguration, Environment environment) throws Exception {

        environment.lifecycle().manage(new MongoService());

        environment.jersey().register(UserResource.class);
    }
}
