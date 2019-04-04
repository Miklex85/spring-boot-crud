FROM fabric8/java-centos-openjdk8-jdk

MAINTAINER Miguel Iglesias <miguel.iglesias@nuuptech.com>

EXPOSE 8080

LABEL io.k8s.description="Ejemplo de Despliegue con Docker File de una Spring Boot App" \
      io.k8s.display-name="Dockerfile Spring Boot CRUD" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="builder,springboot"

RUN mkdir -p /tmp/src/
ADD . /tmp/src/

RUN cd /tmp/src && sh mvnw package -DskipTests=true

RUN cp -a  /tmp/src/target/spring-boot-crud.jar /deployments/spring-boot-crud.jar


