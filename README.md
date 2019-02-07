
# Overview
In this project, We will show how Spring boot and spring data jpa can be used to integrate with postgresql.


## Step 1 Download the code from github
```git clone https://github.com/RajeshBhojwani/springboot-postgresql.git```

## Step 2 Build the project
```gradlew clean build```

## Step 3 Launch the application
```java -jar java -jar build/libs/springposgres-0.0.1-SNAPSHOT.jar```

## Step 4  Use Curl or Postman to test the REST apis created. 


## APIs for Postgresql usage
1. Bulk upload of the customers using below api. No need to pass any data.

http://localhost:9090/bulkcreate

2. POST call to insert one customer based on the JSON data passed.

http://localhost:9090/create

### JSON data
```
{
	"firstName": "Sumit",
	"lastName": "Khan"
}
```

2. GET call to retrive all customers.

http://localhost:9090/findall

3. GET call to search customer by id.
http://localhost:9090/search/{id}

4. GET call to search customer by first name.
http://localhost:9090/searchbyfirstname/{firstname}



For detail explanation of this project check this blog -https://www.rajeshbhojwani.co.in/2019/01/spring-boot-and-postgresql.html




