CREATE TABLE accounts (
  AccountID     NUMBER PRIMARY KEY,
  CustomerID    NUMBER,
  AccountType   VARCHAR2(20), 
  Balance       NUMBER
);

CREATE TABLE employees (
  EmployeeID    NUMBER PRIMARY KEY,
  Name          VARCHAR2(100),
  Department    VARCHAR2(50),
  Salary        NUMBER
);

--Scenario 1 : The bank needs to process monthly interest for all savings accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE LOWER(AccountType) = 'savings';

  COMMIT;
END;
/

BEGIN
  ProcessMonthlyInterest;
END;
/


--Scenario 2 : The bank wants to implement a bonus scheme for employees based on their performance.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_department IN VARCHAR2,
  p_bonus_pct  IN NUMBER  
) IS
BEGIN
  UPDATE employees
  SET Salary = Salary + (Salary * p_bonus_pct / 100)
  WHERE LOWER(Department) = LOWER(p_department);

  COMMIT;
END;
/

BEGIN
  UpdateEmployeeBonus('HR', 10); -- 10% bonus for HR dept
END;
/

BEGIN
  UpdateEmployeeBonus('IT', 10); -- 15% bonus for HR dept
END;
/




--Scenario 3 : Customers should be able to transfer funds between their accounts.

CREATE OR REPLACE PROCEDURE TransferFunds (
  Sender   IN NUMBER,
  Reciever   IN NUMBER,
  amount           IN NUMBER
) IS
  source_balance NUMBER;
BEGIN
  -- Get current balance of source account
  SELECT Balance INTO source_balance
  FROM accounts
  WHERE AccountID = Sender
  FOR UPDATE;

  IF source_balance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  -- Deduct from source
  UPDATE accounts
  SET Balance = Balance - amount
  WHERE AccountID = Sender;

  -- Add to target
  UPDATE accounts
  SET Balance = Balance + amount
  WHERE AccountID = Reciever;

  COMMIT;
END;
/
