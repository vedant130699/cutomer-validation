# Customer Validation Form Web App

This is a Spring Boot-based web application that demonstrates form validation using **Spring MVC**, **Thymeleaf**, and **Hibernate Validator (JSR-303)**. The app allows users to fill in customer information with validation applied to ensure data correctness.

## 🚀 Features

- User-friendly HTML form for customer registration
- Server-side validation using `@NotNull`, `@Size`, and custom validators
- Prevents leading/trailing whitespaces in fields
- Dynamic selection of:
  - Country (dropdown)
  - Favorite programming language (radio buttons)
  - Operating system preferences (checkboxes)
- Displays appropriate error messages using Thymeleaf

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Thymeleaf (template engine)
- Hibernate Validator (JSR-303)
- Maven

## 📸 Screenshots

To be added

## 📂 Project Structure
src/
├── main/
│ ├── java/com/vedant/springboot/thymeleafdemo/
│ │ ├── controller/StudentController.java
│ │ └── model/Student.java
│ └── resources/
│ ├── templates/
│ │ ├── customer-form.html
│ │ └── customer-confirmation.html
│ └── application.properties


## 🧪 Validation Rules

- **First Name**: Required
- **Last Name**: Required, must not be only whitespace
- **Country**: Must be selected
- **Programming Language**: One must be selected (radio)
- **Operating Systems**: At least one may be selected (checkbox)

## 📝 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/vedant130699/cutomer-validation.git
