#!/usr/bin/env bash

#mvn install -DskipTests -Dmaven.javadoc.skip=true -Dcheckstyle.skip -Dhadoop.version=2.3.0 -Dlicense.skip=true
mvn install -DskipTests -Dmaven.javadoc.skip=true -Dcheckstyle.skip -Dlicense.skip=true
bin/tachyon copyDir assembly/target/
bin/tachyon copyDir perf/
bin/tachyon copyDir conf/
bin/tachyon-start.sh all SudoMount -f
