#!/usr/bin/env bash

set -e

docker pull devabacuz/name:latest
docker run -d --name nameserver -p 8082:8082 devabacuz/name:latest
