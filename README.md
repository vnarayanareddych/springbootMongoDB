# springbootMongoDB
CRUD operations for Spring Boot with Mongo DB - Student Example


Mongo DB:

DataBase: use student

URLS's: 

1.POST:

http://localhost:4002/students/addStudent

Request Body:

{
	"id": 2,
	"name": "Narayana",
	"fatherName": "Sreenivas"
}

2. GET: 

All Data: http://localhost:4001/employees/data
Specific Data: http://localhost:4002/students/findAllStudents/2

3. DELETE: 

http://localhost:4002/students/deleteStudent/2
