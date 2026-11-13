# Winter School Booking

A Java Swing desktop application for booking Winter School subjects. Student bookings are stored in a MySQL database and shown in a table inside the app.

## Features

- **Insert**: add a new booking (first name, last name, email, phone, subject)
- **View**: load all bookings from the database into the table
- **Delete**: select a row in the table and remove that booking
- **Reset**: clear the input fields
- **Exit**: close the application after a confirmation prompt

## Built With

- Java (JDK 17)
- Java Swing (NetBeans GUI builder, Absolute Layout)
- JDBC with MySQL Connector/J 8.2.0
- MySQL 8.0
- Apache NetBeans IDE 22

## Database Setup

1. Make sure MySQL Server is running.
2. Run this in MySQL Workbench:

```sql
CREATE DATABASE IF NOT EXISTS fa3_assessment;

CREATE TABLE IF NOT EXISTS fa3_assessment.student_booking (
    FName   VARCHAR(50),
    LName   VARCHAR(50),
    Email   VARCHAR(100),
    Phone   VARCHAR(20),
    Subject VARCHAR(50)
);
```

## Configuration

The connection details are set near the top of `WinterSchoolBooking.java`:

```java
dataConn = "jdbc:mysql://localhost:3306/fa3_assessment";
username = "your_username";
password = "your_password";
```

Replace `your_username` and `your_password` with your own MySQL login. Do not commit your real password to a public repository.

## How to Run

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/WinterSchoolBooking.git
   ```
2. Open the project in NetBeans (**File > Open Project**).
3. Make sure the MySQL Connector/J jar and the AbsoluteLayout library are in the project's Libraries.
4. Set up the database and connection details as described above.
5. Right-click the project and choose **Run**.

## Usage

1. Fill in the form fields and click **Insert** to save a booking.
2. Click **View** to refresh the table with all saved bookings.
3. Click a row in the table, then click **Delete** to remove it.
4. Click **Reset** to clear the form.

## Author

Thabang
