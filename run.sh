echo "****************************************************"
echo ""
echo "1: Maven Building"
echo ""
mvn clean install

echo "****************************************************"
echo ""
echo "2: Docker Image Building"
echo ""
docker build --tag="employee-app:1.1" .

echo "****************************************************"
echo ""
echo "3: MySQL image Building"
echo ""
docker pull mysql:5.7

echo "****************************************************"
echo ""
echo "4: Docker Network Building"
echo ""
docker network create app-db

echo "****************************************************"
echo ""
echo "5: MySQL Container Running"
echo ""
docker run --name mysql --network app-db -e MYSQL_DATABASE=employee -e MYSQL_ROOT_PASSWORD=root -p 3307:3306 -d mysql:5.7

echo "****************************************************"
echo ""
echo "6: Employee Container Running"
echo ""
docker run --name employee --network app-db -p 8001:8080 -d employee-app:1.1
