CREATE DATABASE Library

GO 
USE Library

DROP TABLE IF EXISTS BorrowBook;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Employee;
DROP TABLE IF EXISTS Book;

GO
CREATE TABLE Customer (
    CusId INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(100) NOT NULL,
    Gender NVARCHAR(10),
    Age NVARCHAR(3),
    PhoneNum NVARCHAR(15),
    IdentityNum NVARCHAR(20),
    Address NVARCHAR(200)
);

GO
CREATE TABLE Employee (
    EmpId INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(100) NOT NULL,
    Gender NVARCHAR(10),
    Age NVARCHAR(3),
    PhoneNum NVARCHAR(15),
    Address NVARCHAR(200),
    Salary FLOAT
);

GO
CREATE TABLE Book (
    BookId INT PRIMARY KEY IDENTITY(1,1),
    Name NVARCHAR(200) NOT NULL,
    Category NVARCHAR(50),
    Amount INT,
    Status NVARCHAR(20)
);

GO
CREATE TABLE BorrowBook (
    BorrowId INT IDENTITY(1,1) PRIMARY KEY,
    BookId INT FOREIGN KEY REFERENCES Book(BookId),
    CusId INT FOREIGN KEY REFERENCES Customer(CusId),
    Name NVARCHAR(200),
    Amount INT,
    BorrowDate NVARCHAR(20),
    PayDate NVARCHAR(20),
    CONSTRAINT FK_Book FOREIGN KEY (BookId) REFERENCES Book(BookId),
    CONSTRAINT FK_Customer FOREIGN KEY (CusId) REFERENCES Customer(CusId)
);

INSERT INTO Customer (Name, Gender, Age, PhoneNum, IdentityNum, Address)
VALUES 
('John Doe', 'Male', '30', '123-456-7890', 'ID12345', '123 Main St'),
('Jane Smith', 'Female', '25', '123-555-7890', 'ID67890', '456 Elm St');

-- Insert demo data into Employee table
INSERT INTO Employee (Name, Gender, Age, PhoneNum, Address, Salary)
VALUES 
('Alice Johnson', 'Female', '28', '555-123-7890', '789 Oak St', 50000),
('Bob Brown', 'Male', '35', '555-456-7890', '101 Pine St', 60000);

-- Insert demo data into Book table
INSERT INTO Book (Name, Category, Amount, Status)
VALUES 
('The Great Gatsby', 'Fiction', 5, 'Available'),
('To Kill a Mockingbird', 'Fiction', 3, 'Available'),
('1984', 'Dystopian', 4, 'Borrowed');

-- Insert demo data into BorrowBook table
INSERT INTO BorrowBook (BookId, CusId, Name, Amount, BorrowDate, PayDate)
VALUES 
(1, 1, 'John Doe', 1, '2024-10-01', '2024-10-15'),
(2, 2, 'Jane Smith', 1, '2024-10-05', '2024-10-20');