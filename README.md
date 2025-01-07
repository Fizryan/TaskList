# Task Manager Application 📋

[![GitHub Issues](https://img.shields.io/github/issues/Fizryan/TaskList)](https://github.com/Fizryan/TaskList/issues)
[![GitHub License](https://img.shields.io/github/license/Fizryan/TaskList)](https://github.com/Fizryan/TaskList/blob/main/LICENSE)
[![Java Version](https://img.shields.io/badge/Java-8%2B-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![GitHub repo size](https://img.shields.io/github/repo-size/Fizryan/TaskList?color=tomato)](https://github.com/Fizryan/TaskList)
[![GitHub watchers](https://img.shields.io/github/watchers/Fizryan/TaskList)](https://github.com/Fizryan/TaskList/watchers)

### **Welcome to the Task Manager App!** 🚀  
Effortlessly manage your **personal** and **work-related** tasks. Stay on top of your deadlines, keep track of your progress, and improve your productivity. 

---

## 🌟 **Features**  
The Task Manager App offers the following functionalities:

- **User Authentication**: Secure registration and login system for users to keep their tasks private.
- **Task Management**:
  - Add new tasks with a name, description, and due date.
  - Edit and update existing tasks with new details.
  - Delete tasks you no longer need.
  - View all tasks along with the time remaining until their due dates.
- **Task Categories**: Tasks are categorized into **Personal** and **Work** types, making it easier to organize.
- **Persistence**: Tasks are saved in `.dat` files, ensuring your tasks are not lost when the application is closed.

---

## 🔧 **Technologies Used**  
The app is built using the following technologies:

- **Java**: Core programming language.
- **SimpleDateFormat**: For formatting and validating dates.
- **File Handling**: Tasks are serialized into `.dat` files and loaded back on program startup.

---

## 🏁 **Getting Started**  

To set up the application on your local machine, follow these steps:

### :clipboard: **Prerequisites**

- Make sure you have **Java 8** or higher installed.  
  You can download Java from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### :floppy_disk: **Clone the Repository**

Clone the repository to your local machine with:

```bash
git clone https://github.com/Fizryan/TaskList.git
```

### :hammer_and_wrench: **Compile and Run**

1. Navigate to the project directory:

   ```bash
   cd TaskList/src/tasklist
   ```

2. Compile the project:

   ```bash
   javac TaskList.java
   ```

3. Run the main class:

   ```bash
   java Main
   ```

---

## 📚 **Example Usage**

### :key: **Login**

```plaintext
Enter Username: user123
Enter Password: password123
```

### :white_check_mark: **Add Task**

```plaintext
Nama Tugas: Belajar Java
Deskripsi: Belajar tentang Polymorphism
Tenggat Waktu (dd-mm-yyyy): 12-12-2025
```

### :memo: **View Tasks**

```plaintext
Tugas 1:
Nama Tugas: Belajar Java
Deskripsi: Belajar tentang Polymorphism
Tenggat Waktu: 12-12-2025
```

---

## ⚠️ **Error Handling**

The application handles several types of errors:

- **Invalid Date Format**: If the date entered is not in the `dd-MM-yyyy` format, an error message will display.
- **Invalid Task Type**: Only "Personal" or "Work" are accepted task types. Any other input will be flagged as an error.

---

## 🤝 **Contributing**

We welcome contributions to the project! To contribute:

1. **Fork** the repository.
2. **Create a new branch**: `git checkout -b feature-name`.
3. **Make changes** and commit them: `git commit -am 'Add new feature'`.
4. **Push** to your branch: `git push origin feature-name`.
5. **Create a pull request** with your changes.

---

## 📄 **License**  

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more details.

---
