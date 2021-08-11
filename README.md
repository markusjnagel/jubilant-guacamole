# Mock REST API Server  
## built with OpenAPI generator 
This server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate a server stub based on a given OpenAPI spec.

Built on Spring Boot, JDK11

Runnable on OpenShift via
```
oc new-app registry.access.redhat.com/openjdk/openjdk-11-rhel7~https://github.com/markusjnagel/jubilant-guacamole.git
```
or locally via
```
mvn clean package
java -jar target/openapi-spring-1.0.0.jar 
```
(I left the generated name and tags in the pom.xml - it's just a mockup, after all)

## Overview  
Swagger UI is available on http://localhost:8080 or OpenShift Route (service needs to be exposed)

All three endpoints randomly return their allowed HTTP Status codes to test the compensations (try with e.g. 
```
[🎩︎mnagel openapi-generator] (master) $ curl -i -X DELETE "http://mock-api-pam.apps-crc.testing/api/v1/sagapoc/d8d6f2ba-7edb-4469-bf68-abb64005daf7/varmistus" -H "accept: application/json"
HTTP/1.1 404 
Content-Length: 0
Date: Tue, 10 Aug 2021 23:31:59 GMT
Set-Cookie: 6bc69627a6bb1fc78a4e9a8fcf48612b=8ee8dc69c4d8d37bfd5e8dca4de83979; path=/; HttpOnly

```
to see the return code (or via SwaggerUI)



