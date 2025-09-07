# Student Management System (Java + MySQL)

A simple console-based student database application built with **Java (JDBC)** and **MySQL**.

## Setup

1. **Database Setup**
   - Open MySQL and create a database:
     ```sql
     CREATE DATABASE studentdb;
     ```
   - Switch to the database:
     ```sql
     USE studentdb;
     ```
   - Create the `students` table:
     ```sql
     CREATE TABLE students (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(50) NOT NULL,
         age INT,
         email VARCHAR(50)
     );
     ```

2. **Java Setup**
   - Clone this repository:
     ```bash
     git clone https://github.com/YOUR-USERNAME/student-management.git
     ```
   - Open the project in your IDE (e.g., IntelliJ, Eclipse, VS Code with Java).  
   - Ensure you have the MySQL JDBC driver (Connector/J) added to your classpath.

3. **Run the Program**
   - Run the `StudentApp.java` file.
   - You will see the menu:
     ```
     1. Add Student
     2. View Students
     3. Update Student
     4. Delete Student
     5. Exit
     ```

## Assumptions / Notes
- Database username: `root`
- Database password: `YOUR_PASSWORD` (update in `DatabaseConnection.java`)
- Program assumes the MySQL server is running locally on port `3306`.

---
