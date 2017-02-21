package com.networknt.account;

import com.networknt.json.router.ServiceHandler;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

/**
 * Created by steve on 20/02/17.
 */
@ServiceHandler(id="www.networknt.com#get.account-1.0.0")
public class GetAccountHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.getResponseSender().send("account");

    }
}
