#!/usr/bin/env bash
rm -rf /Users/malin/.m2/repository/com/bytedance/android/ && \
./gradlew clean && \
./gradlew publishToMavenLocal
