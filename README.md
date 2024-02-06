# otel-observability

# Getting started

## Kubernetes setup

Start up your own Kubernetes (`minikube` in this case)

```shell
minikube start
minikube dashboard
```

## Build the container image

```shell
eval $(minikube docker-env)

./gradlew clean build

docker build -t otel-observability .

minikube image ls
```

## Deploy using Helm

```shell
# make sure you have imagePullPolicy: IfNotPresent on specs
helm install -f app-k8s.yml app-k8s ./app

# to undeploy
helm uninstall app-k8s
```
