package com.mygroup;

import com.mygroup.resources.Route;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class mydropApplication extends Application<mydropConfiguration> {

    public static void main(final String[] args) throws Exception {
        new mydropApplication().run(args);
    }

    @Override
    public void initialize(final Bootstrap<mydropConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final mydropConfiguration configuration,
                    final Environment environment) {
        Route route = new Route();
        environment.jersey().register(route);
        System.out.println("i am running");
    }

}