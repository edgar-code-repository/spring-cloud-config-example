Config Service and Config Client Example
--------------------------------------------------------------------------------------------------------------------

This Github repository contains two microservices developed with Spring Boot and Spring Cloud.

**Config Service:**

This microservice is a Config Service that reads properties from another Github repo.

https://github.com/edgar-code-repository/config-repository-example

**Client Service:**

This microservice reads its properties from the Config Service and uses
the "Retry" library in case the Config Service is not available temporarily.

--------------------------------------------------------------------------------------------------------------------
