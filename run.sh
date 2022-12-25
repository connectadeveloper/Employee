docker run --name mysql --network app-db -e MYSQL_DATABASE=employee -e MYSQL_ROOT_PASSWORD=root -p 3307:3306 -d mysql:5.7


docker build --tag=employee-app:1.1 .



docker run --name employee --network app-db -p 8001:8080 -d employee-app:1.1