FROM openjdk:11
VOLUME/tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF/lib /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["-java" , "-cp" ,"app:app/lib/*", "br.com.rocklucas.curso_aws_pr    oject01.AwsprojectApplication"]