#!/usr/bin/bash
set -xv

cd otel-a
helm uninstall otel-a

cd ..
cd otel-b
helm uninstall otel-b
