# Password Validator Project 

This project is a Java-based application designed to validate user passwords during a registration process. It enforces strict password security criteria and provides clear feedback using custom exceptions and structured logging.

## Features
- Validates passwords for:
- Minimum and maximum length.
- Presence of lowercase, uppercase, digits, and special characters.
- Matching confirmation password.
- Custom exceptions for:
- Weak passwords.
- Password mismatch.
- Implements a ValidationLogger class with AutoCloseable for structured logging.
- Logs success, failure, and process completion messages.

## Technologies Used
- Java 8+
- Exception Handling
- Try-With-Resources
- Logging
  
## How to Run
Clone the repository.
bash
Copy code
git clone <repository-url>  
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
Compile and run the UserRegistration class.
Follow the prompts to enter and validate a password.
