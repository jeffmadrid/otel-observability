#!/usr/bin/bash
set -xv

# build jar
cd otel-a
./gradlew clean build

# build container image
eval $(minikube docker-env)
docker build
docker build -t otel-a .

# build jar
cd ..
cd otel-b
./gradlew clean build

# build container image
eval $(minikube docker-env)
docker build
docker build -t otel-b .
