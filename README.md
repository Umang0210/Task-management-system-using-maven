# 📝 Task Management System (TMS)

A simple **Task Management System** built using **Java 17**, **Spring Boot**, and **Maven**, designed to demonstrate core **CRUD operations**, **RESTful APIs**, and **modern Java project structure**.
The application includes a lightweight frontend and is executed entirely using **Maven**.

---

## 📌 Project Overview

The Task Management System allows users to:
- Create tasks
- View all tasks
- Mark tasks as completed or pending
- Delete individual tasks
- Delete all tasks

The project intentionally avoids database complexity by using **in-memory storage**, making it ideal for academic purposes and beginner-friendly learning.

---

## 🛠️ Tools & Technologies Used

- **Java 17**
- **Spring Boot**
- **Maven**
- **Git & GitHub**
- **HTML, CSS, JavaScript**
- **VS Code**

---

## 🏗️ Project Architecture

**Frontend**
- HTML, CSS, JavaScript
- Served as static resources
- Communicates via REST APIs

**Backend**
- Spring Boot REST Controllers
- Service layer for business logic
- In-memory storage using `ConcurrentHashMap`

---

## 📂 Project Folder Structure

```
tms
├── pom.xml
├── src
│   ├── main
│   │   ├── java/com/example/tms
│   │   └── resources/static/index.html
│   └── test
```

---

## 🔗 REST API Endpoints

| Method | Endpoint | Description |
|------|---------|------------|
| POST | `/api/tasks` | Create a task |
| GET | `/api/tasks` | Get all tasks |
| PUT | `/api/tasks/{id}` | Update task |
| DELETE | `/api/tasks/{id}` | Delete task |
| DELETE | `/api/tasks` | Delete all tasks |

---

## ▶️ How to Run the Project

```bash
mvn clean
mvn spring-boot:run
```

Open:
```
http://localhost:8080
```

---

## 🧪 Maven & Git Commands Used

```bash
mvn clean
mvn spring-boot:run
mvn clean package
git init
git add .
git commit -m "Initial commit"
git push
```

---

## 🚀 Future Enhancements

- Database integration
- User authentication
- Task filtering and search
- Cloud deployment

---

## 👤 Author

**Umang Garg**
