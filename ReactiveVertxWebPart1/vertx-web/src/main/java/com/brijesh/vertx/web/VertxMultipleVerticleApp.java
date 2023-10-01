package com.brijesh.vertx.web;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class VertxMultipleVerticleApp {

  public static void main(String[] args){
    Vertx vertx= Vertx.vertx();

    DeploymentOptions deploymentOptions= new DeploymentOptions().setInstances(3);

    vertx.deployVerticle(Publisher.class.getName(),deploymentOptions);
    vertx.deployVerticle(Consumer.class.getName());
  }
}
