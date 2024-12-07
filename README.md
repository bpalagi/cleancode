
This is a sample Spring Boot Application, with an "Orders" theme.


To run:

0. `docker-compose down`
1. `./gradlew clean build`
2. `docker-compose up --build`



`curl -X POST http://localhost:3000/create-order -H "Content-Type: application/json" -d '{"product": "Example Product"}'`

`curl -X GET http://localhost:8080/orders`

