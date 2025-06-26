CREATE TABLE Customers (
  CustomerID      NUMBER PRIMARY KEY,
  Name            VARCHAR2(100),
  Age             NUMBER,
  Balance         NUMBER(10,2),
  IsVIP           VARCHAR2(5),
  LoanInterestRate NUMBER(5,2)
);

CREATE TABLE Loans (
  LoanID          NUMBER PRIMARY KEY,
  CustomerID      NUMBER,
  DueDate         DATE,
  FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

INSERT INTO Customers VALUES (1, 'Rajesh', 65, 12000.00, 'FALSE', 6.5); 
INSERT INTO Customers VALUES (2, 'Abdul', 45, 9500.00, 'FALSE', 7.2); 
INSERT INTO Customers VALUES (3, 'Joseph', 70, 15000.00, 'FALSE', 5.9); 
INSERT INTO Customers VALUES (4, 'Harpreet', 30, 2000.00, 'FALSE', 8.0); 
INSERT INTO Customers VALUES (5, 'Shreyas', 61, 11000.00, 'FALSE', 6.8); 

SELECT * FROM Customers;

INSERT INTO Loans VALUES (101, 1, SYSDATE + 10);  
INSERT INTO Loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, SYSDATE + 5);  
INSERT INTO Loans VALUES (104, 4, SYSDATE + 29);  
INSERT INTO Loans VALUES (105, 5, SYSDATE - 1);   

SELECT * FROM Loans;




--Scenario 1: Apply Discount for Customers Age > 60
BEGIN
  FOR cust IN (SELECT CustomerID, Age FROM Customers) LOOP
    IF cust.Age > 60 THEN
      UPDATE Customers
      SET LoanInterestRate = LoanInterestRate - 1
      WHERE CustomerID = cust.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;

SELECT * FROM Customers;

--2: Set IsVIP = TRUE for Balance > $10,000

BEGIN
  FOR vip IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF vip.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = vip.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;

SELECT * FROM Customers;

--Scenario 3: Send Loan Reminders (Due in 30 Days)
BEGIN
  FOR loan IN (
    SELECT L.LoanID, L.DueDate, C.Name
    FROM Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    WHERE L.DueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Dear ' || loan.Name || 
      ', your loan (ID: ' || loan.LoanID || 
      ') is due on ' || TO_CHAR(loan.DueDate, 'DD-Mon-YYYY')
    );
  END LOOP;
END;
