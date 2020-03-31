#!/usr/bin/env bash
./gradlew example:assembleDebug --no-daemon --offline -Dorg.gradle.jvmargs="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005"

