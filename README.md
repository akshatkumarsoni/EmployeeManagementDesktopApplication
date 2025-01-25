# 📋 Employee Management System  

**MINI PROJECT**  

The **Employee Management System** is a Java-based desktop application designed to efficiently manage employee data.  
It provides a user-friendly interface for performing CRUD operations and adheres to a layered architecture for better scalability and maintainability.

---

## ⚙️ Features  

- **Add Employee**: Add a new employee to the system.  
- **Search Employee**: Search for an employee's details using their ID or name.  
- **View All Employees**: Display all employees in the system.  
- **Update Employee**: Modify details of an existing employee.  
- **Delete Employee**: Remove an employee from the system.  
- **Quit**: Exit the application.  

---

## 🛠️ Project Structure  

The project follows a **three-layered architecture**:  

1. **Front End Layer** (`empmgmt.gui`)  
   - Contains the UI elements and frames for user interaction.  

2. **Back End Layer** (`empmgmt.dao`)  
   - Includes classes and methods that interact with the database.  

3. **Database Utility Layer** (`empmgmt.dbutil`)  
   - Manages database connectivity.  

4. **Data Model Layer** (`empmgmt.pojo`)  
   - Holds POJO (Plain Old Java Object) or DTO (Data Transfer Object) classes for data representation.  

---

## 📊 Architecture Diagram  

![Architecture Diagram](assets/architecture-diagram.png)

The following layers ensure proper separation of concerns:  

```plaintext
+---------------------+
|   Front End Layer   |   <-- empmgmt.gui
|   (UI Components)   |
+---------------------+
          |
          v
+---------------------+
|   Middle Layer      |   <-- empmgmt.dao
| (Business Logic +   |
|  Database Access)   |
+---------------------+
          |
          v
+---------------------+
| Database Utility    |   <-- empmgmt.dbutil
| (DB Connection)     |
+---------------------+
          |
          v
+---------------------+
|   Data Model Layer  |   <-- empmgmt.pojo
| (POJO/DTO Classes)  |
+---------------------+



✨ Screenshots

![Option Frame](assets/OptionFrame.png)
![AddEmployee Frame](assets/AddEmployee.png)
![DeleteEmployee Frame](assets/DeleteEmployee.png)
![SearchEmployee Frame](assets/SearchEmployee.png)
![ShowAllEmployee Frame](assets/ShowAllEmployee.png)
![UpdateEmployee Frame](assets/UpdateEmployee.png)




🚀 How to Run

1. Clone or download the repository:

2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

3. Ensure the required database setup is complete and update the connection details in empmgmt.dbutil.

4. Run the main class in the empmgmt.gui package to launch the application.

🤝 Contributions
Feel free to contribute or suggest improvements by creating an issue or submitting a pull request! 😊
