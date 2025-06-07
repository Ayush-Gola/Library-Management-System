# 📚 Library Management System - Java Console Project

A user-friendly library management system designed using **Object-Oriented Programming (OOP)** principles in **Java**.  
It provides separate modules for **Users** and **Librarians**, allowing book issue, return, search, and inventory management directly from the terminal.

---

## 🚀 Features

- 👤 User Signup & Login
- 📖 View Available Books
- ✅ Issue & Return Books
- 👮 Librarian Book Management (Add / Check / Update Stock)
- 🗃️ Data stored in memory using `HashMap` and arrays

---

---

## 🛠️ Tech Stack

| 🔧 Tool              | 💡 Purpose                             |
|----------------------|----------------------------------------|
| ☕ Java               | Core programming language              |
| 🖥️ Java Console I/O   | User interaction via `Scanner`         |
| 🧠 HashMap, Arrays    | In-memory storage for books and users  |
| 🧪 JDK 8+             | Java version compatibility             |

---

## 💡 Concepts Used

| 📘 Concept         | 🔍 Description |
|-------------------|----------------|
| **OOP Principles** | Encapsulation, Abstraction, Modularity, Inheritance |
| **Modular Design** | Separated `Driver`, `Entity`, `Service`, `Repository` layers |
| **Collections**    | `HashMap` used to manage book inventory |
| **Console UI**     | Interactive CLI with emojis and formatting |
| **Data Handling**  | In-memory management of books and users using arrays & maps |

---

## 🗂️ Project Structure

project/
│
├── Driver/
│ └── Driver.java # App Entry Point
│
├── Entity/
│ ├── Book.java # Book POJO
│ ├── Librarian.java # Librarian POJO
│ └── User.java # User POJO
│
├── Repository/
│ └── Database.java # In-memory Database
│
└── Service/
├── LibraryService.java # Librarian Services
└── UserService.java # User Services




---

## 🧠 Object-Oriented Principles in Action

| 🧩 Principle     | ✅ Where it's Applied                                          |
|------------------|---------------------------------------------------------------|
| **Encapsulation** | Private fields in `Book`, `User`, etc. with appropriate access |
| **Abstraction**   | Business logic hidden inside service classes                   |
| **Modularity**    | Clear separation between Entity, Service, Repository, Driver   |
| **Inheritance**   | Can be extended (e.g., Librarian/User roles in future)         |

---

## 🔮 Future Enhancements

- 💾 File or DB-based persistent storage
- 🌈 Improve CLI UI (e.g., colors with `Jansi`)
- 🧪 JUnit Test Coverage
- 📊 Admin dashboard with stats
- 📤 Export Book List to CSV / PDF

---

## 📸 Sample Console Output
![image](https://github.com/user-attachments/assets/d7d25b32-8faf-4cd4-bf20-ba1e7a53c0af)


## 🚀 How to Run

### 🧑‍💻 Prerequisites
- JDK 8 or higher installed
- Java compiler accessible in terminal (`javac`, `java`)

### 🏃‍♂️ Steps to Execute

```bash
# 1️⃣ Navigate to project directory
cd path/to/project

# 2️⃣ Compile all Java files
javac Driver/Driver.java

# 3️⃣ Run the program
java Driver.Driver


---

## 📜 License

📝 This project is open-source and free to use for educational purposes.

---

## 🙋‍♂️ Author
Ayush Gola
📧 ayushgola851@gmail.com
👨‍💻 Passionate about building clean Java apps with real-world utility. 

---


