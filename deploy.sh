#!/usr/bin/bash
set -xv

cd otel-a
helm install otel-a ./helm

cd ..
cd otel-b
helm install otel-b ./helm
