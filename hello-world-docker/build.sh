#!/usr/bin/env bash
mvn clean package #java package
docker image build -t hello-world-docker-java:latest . #build the image
docker container run hello-world-docker-java:latest #execute as container