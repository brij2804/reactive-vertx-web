package com.brijesh.vertx.web;

import io.vertx.core.AbstractVerticle;

public class Publisher extends AbstractVerticle {

  @Override
  public void start(){
    vertx.setPeriodic(3000,
      timerID -> vertx.eventBus().publish("com.brijesh.vertx.news-feed","News from Sender on"+Thread.currentThread().getName()));
   }
}
