## DIGITAL LOCKER


## Screenshots

### User Dashboard
<img width="1050" height="900" alt="localhost_9090_home (1)" src="https://github.com/user-attachments/assets/e301d836-0acb-4917-8a03-d669de5b8299" />

### Admin Panel
<img width="90%" height="75%" alt="localhost_9090_admin" src="https://github.com/user-attachments/assets/1b53bbaf-329a-4745-867e-a3f1f264fa9c" />

### Secure Cloud Storage and Personal Information Management System

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-Framework-brightgreen)
![Java](https://img.shields.io/badge/Java-Backend-orange)
![MyBatis](https://img.shields.io/badge/MyBatis-Persistence-blue)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Frontend-green)

## About the Project

Digital Locker is a cloud-based storage and personal information management application developed using Java and Spring Boot. The application allows users to securely manage files, notes, and website credentials from a single dashboard.

This project is a **forked and modified version** of the original project:

* urlCloud-Storage-Java-Spring-Boot Repository[https://github.com/ahn-nath/Cloud-Storage-Java-Spring-Boot](https://github.com/ahn-nath/Cloud-Storage-Java-Spring-Boot)

Additional features, merged changes, improvements, and custom modifications have been added to this forked version.

## Credits

Special thanks and full credit to:

* urlAhn Nath GitHub Profile[https://github.com/ahn-nath](https://github.com/ahn-nath)
* Original Project: urlCloud-Storage-Java-Spring-Boot[https://github.com/ahn-nath/Cloud-Storage-Java-Spring-Boot](https://github.com/ahn-nath/Cloud-Storage-Java-Spring-Boot)

This repository is based on the original open-source project created by Ahn Nath.

---

## Features

### User Authentication

* User Signup and Login
* Secure Authentication using Spring Security
* Session Management
* Unauthorized Access Protection

### File Management

* Upload Files
* Download Files
* Delete Files
* Prevent Duplicate File Uploads
* File Size Validation

### Notes Management

* Create Notes
* Edit Notes
* Delete Notes
* View Saved Notes

### Credential Management

* Save Website Credentials
* Password Encryption
* Edit Credentials
* Delete Credentials
* Secure Storage of Sensitive Information

---

## Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* MyBatis

### Frontend

* Thymeleaf
* Bootstrap
* HTML/CSS

### Database

* H2 Database / MySQL (depending on configuration)

### Testing

* Selenium
* JUnit

---

## Project Structure

```bash
src/
 ├── main/
 │    ├── java/
 │    ├── resources/
 │    └── templates/
 └── test/
```

---

## Installation and Setup

### Prerequisites

Make sure you have installed:

* Java JDK 8 or later
* Maven or Gradle
* IntelliJ IDEA / Eclipse / VS Code

### Clone the Repository

```bash
git clone https://github.com/Sudesh-Malangner-git/Digital_Locker.git
```

### Open the Project

Import the project into your preferred Java IDE.

### Run the Application

Run the main Spring Boot application class.

```bash
CloudStorageApplication.java
```

### Access the Application

After successful startup, open:

```bash
http://localhost:9090
```

---

## Security Features

* Password Encryption
* Secure User Authentication
* Protected Routes
* Session Handling
* Credential Protection

---

## Future Improvements

* Cloud Deployment
* Email Verification
* Profile Management
* File Sharing System
* Dark Mode UI
* Two-Factor Authentication

---

## Differences from the Original Project

Compared to the original repository, this fork includes several merged updates and custom improvements.

### Additional Improvements in This Fork

Compared to the original project, this fork introduces several major improvements and real-world features:

- Permanent database storage support instead of temporary memory-based storage used in the original project
- Added a Support Section where users can submit issues, complaints, or reports
- Added an Admin Panel for reviewing and resolving user support requests
- Added Admin Management features for managing user accounts and uploaded files
- Improved backend structure and scalability for future development
- Enhanced overall usability and project organization

### Why This Fork is Better

This version is designed to be closer to a real-world cloud storage application by adding:

- Persistent data management
- Administrative controls
- User support system
- Better project maintainability
- Improved extensibility for future features

### Why This Fork is Better for Learning

This version is more suitable for:

* Learning Spring Boot project structure
* Understanding authentication and security
* Practicing CRUD operations
* Understanding file handling in Java
* Working with MyBatis and database integration
* Exploring real-world backend architecture

---

## Project Evaluation

### Overall Quality

This project is a strong intermediate-level Java Spring Boot application.

### Strengths

* Good use of Spring Boot architecture
* Clean separation of Controllers, Services, Models, and Mappers
* Secure authentication implementation
* Practical real-world use case
* Good CRUD functionality implementation
* Useful for academic and portfolio purposes
* Strong foundation for cloud storage system development

### Areas That Can Be Improved Further

* Add REST APIs
* Add JWT Authentication
* Add Docker support
* Improve frontend responsiveness
* Add cloud deployment support
* Implement role-based access control
* Add email verification and password recovery

### Recommended Usage

This project is excellent for:

* College major projects
* Resume/portfolio projects
* Learning Spring Boot practically
* Understanding secure file management systems
* Backend development practice

---

## Fork Information

This repository contains merged updates and custom changes built on top of the original project.

The base project belongs to:

* urlAhn Nath GitHub Profile[https://github.com/ahn-nath](https://github.com/ahn-nath)

Please support and star the original repository as well.

---

## License

This project follows the same open-source licensing approach as the original repository.

---

## Acknowledgements

Thanks to the open-source community and especially the original creator for providing the foundation of this project.
