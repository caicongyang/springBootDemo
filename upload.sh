#!/bin/bash

mvn clean install -Dmaven.test.skip=true

cd stock/target
scp stock-0.0.1-SNAPSHOT.jar  root@124.221.175.114:/opt/data/


