https://stackoverflow.com/questions/61500897/gradle-springboot-mavenpublish-publication-only-contains-dependencies-and-or
https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry
https://docs.github.com/en/enterprise-cloud@latest/actions/publishing-packages/publishing-java-packages-with-gradle
https://medium.com/swlh/devops-with-github-part-1-github-packages-with-gradle-c4253cdf7ca6

curl -X PUT "https://maven.pkg.github.com/jvrs01/r02/ARTEFACT.jar" -H "Authorization: token ghp_***" --upload-file "BootDD2-0.0.1-SNAPSHOT.jar" -vvv

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.2/gradle-plugin/reference/html/#build-image)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#data.sql.jdbc)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#features.docker-compose)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.2/reference/htmlsingle/index.html#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Docker Compose support

This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)

Please review the tags of the used images and set them to the same as you're running in production.

