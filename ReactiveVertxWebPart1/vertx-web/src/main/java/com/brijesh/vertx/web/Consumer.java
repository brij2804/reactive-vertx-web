package com.brijesh.vertx.web;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Handler;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.Message;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer extends AbstractVerticle {
  private final Logger logger = Logger.getLogger("Log");

  @Override
  public void start(){
    EventBus eventBus= vertx.eventBus();
    Handler<Message<String>> messageHandler = receivedMessage -> logger.log(Level.INFO,receivedMessage.body());

    eventBus.consumer("com.brijesh.vertx.news-feed",messageHandler);
  }
}
