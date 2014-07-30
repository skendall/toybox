package org.kndl.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CamelFile {
    public static void main(String args[]) {
        CamelContext context = new DefaultCamelContext();
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("file:src/main/resources/input.txt").to("file:build/output.txt");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
