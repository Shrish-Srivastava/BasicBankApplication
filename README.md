# Basic Bank Project – Requirement 1

## Topic

Encapsulation

## Project Title

Simple Bank Account System Using Encapsulation

## Requirement for Today

Build a basic bank project for a single bank account using the concept of Encapsulation.

In this project, students need to create one bank account and perform basic operations like login, check balance, deposit amount, withdraw amount, display account details, and exit.

The project should be built using Class, Object, Private Instance Variables, Constructor, Methods, Scanner, if-else, switch-case, and loop.

## Objective

The main objective of this project is to understand how encapsulation works in Java.

Students should learn how to keep important data private inside a class and access that data only through methods.

In a real bank application, account details like account number, account holder name, PIN, and balance should not be directly accessible from outside the class.

So, in this project, students must declare all account details as private instance variables and perform all operations using public methods.

## Project Description

Create a Java program for a simple bank account system.

The program should store the details of one bank account.

The user should first login using the account PIN.

If the PIN is correct, the user should be allowed to perform banking operations.

If the PIN is wrong, the program should display `Invalid PIN` and stop.

After successful login, the user should see a menu with options to check balance, deposit amount, withdraw amount, display account details, and exit.

The menu should continue until the user chooses the exit option.

## Class Structure

### Class Name

`BankAccount`

### Instance Variables

The `BankAccount` class must contain the following private instance variables.

```java
private int accountNumber;
```

This variable is used to store the bank account number.

```java
private String accountHolderName;
```

This variable is used to store the account holder name.

```java
private int pin;
```

This variable is used to store the secret PIN of the account.

```java
private double balance;
```

This variable is used to store the current balance of the account.

### Important Rule

All instance variables must be declared as private.

Students should not access these variables directly from the main method.

## Constructor Requirement

### Constructor Name

`BankAccount`

### Constructor Type

Parameterized Constructor

### Constructor Purpose

The constructor should be used to initialize the account details when the object is created.

### Constructor Parameters

The constructor should accept:

* accountNumber
* accountHolderName
* pin
* balance

### Constructor Structure

```java
BankAccount(int accountNumber, String accountHolderName, int pin, double balance)
```

### Example Object Creation

```java
BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
```

## Methods Required

## Method 1: Login Method

### Method Name

`login`

### Return Type

`boolean`

### Parameter

```java
int enteredPin
```

### Method Structure

```java
boolean login(int enteredPin)
```

### Purpose

This method should check whether the PIN entered by the user is correct or not.

### Logic

If the entered PIN is equal to the actual PIN, return `true`.

If the entered PIN is not equal to the actual PIN, return `false`.

### Expected Output

When the PIN is correct:

```text
Login Successful
```

When the PIN is wrong:

```text
Invalid PIN
```

## Method 2: Check Balance Method

### Method Name

`checkBalance`

### Return Type

`void`

### Parameter

No parameter

### Method Structure

```java
void checkBalance()
```

### Purpose

This method should display the current balance of the account.

### Expected Output

```text
Current Balance: 5000.0
```

## Method 3: Deposit Method

### Method Name

`deposit`

### Return Type

`void`

### Parameter

```java
double amount
```

### Method Structure

```java
void deposit(double amount)
```

### Purpose

This method should add money to the account balance.

### Logic

If the deposit amount is greater than zero, add the amount to the balance.

If the deposit amount is zero or negative, display `Invalid Deposit Amount`.

### Expected Output for Valid Deposit

```text
Amount Deposited Successfully
Updated Balance: 7000.0
```

### Expected Output for Invalid Deposit

```text
Invalid Deposit Amount
```

## Method 4: Withdraw Method

### Method Name

`withdraw`

### Return Type

`void`

### Parameter

```java
double amount
```

### Method Structure

```java
void withdraw(double amount)
```

### Purpose

This method should withdraw money from the account balance.

### Logic

If the withdrawal amount is greater than zero and the account has sufficient balance, subtract the amount from the balance.

If the withdrawal amount is greater than the balance, display `Insufficient Balance`.

If the withdrawal amount is zero or negative, display `Invalid Withdrawal Amount`.

### Expected Output for Valid Withdrawal

```text
Amount Withdrawn Successfully
Updated Balance: 4000.0
```

### Expected Output for Insufficient Balance

```text
Insufficient Balance
```

### Expected Output for Invalid Withdrawal Amount

```text
Invalid Withdrawal Amount
```

## Method 5: Display Account Details Method

### Method Name

`displayAccountDetails`

### Return Type

`void`

### Parameter

No parameter

### Method Structure

```java
void displayAccountDetails()
```

### Purpose

This method should display the account number and account holder name.

### Important Rule

The PIN should not be displayed.

### Expected Output

```text
Account Number: 1001
Account Holder Name: Rahul
```

## Main Class Structure

### Main Class Name

`BankApp`

The `BankApp` class should contain the `main` method.

Inside the main method, create one object of the `BankAccount` class.

### Object Creation

```java
BankAccount account = new BankAccount(1001, "Rahul", 1234, 5000.0);
```

After creating the object, ask the user to enter the PIN.

If the PIN is correct, display the banking menu.

If the PIN is wrong, display `Invalid PIN` and stop the program.

## Menu After Successful Login

After successful login, display the following menu:

```text
1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit
```

## Menu Operation Details

If the user enters `1`, call the `checkBalance()` method.

If the user enters `2`, ask the user to enter the deposit amount and call the `deposit(amount)` method.

If the user enters `3`, ask the user to enter the withdrawal amount and call the `withdraw(amount)` method.

If the user enters `4`, call the `displayAccountDetails()` method.

If the user enters `5`, display an exit message and stop the program.

If the user enters any other number, display `Invalid Choice`.

## Complete Program Flow

First, create a bank account object with account number, account holder name, PIN, and balance.

Next, ask the user to enter the PIN.

If the entered PIN is wrong, display `Invalid PIN`.

If the entered PIN is correct, display `Login Successful`.

After successful login, display the banking menu.

Ask the user to enter their choice.

Based on the user choice, call the correct method.

After completing one operation, show the menu again.

The menu should continue until the user chooses Exit.

## Sample Input and Output

### Sample Output 1: Successful Login and Check Balance

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
1

Current Balance: 5000.0
```

### Sample Output 2: Deposit Amount

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
2

Enter deposit amount:
2000

Amount Deposited Successfully
Updated Balance: 7000.0
```

### Sample Output 3: Withdraw Amount

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
3

Enter withdrawal amount:
1000

Amount Withdrawn Successfully
Updated Balance: 4000.0
```

### Sample Output 4: Display Account Details

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
4

Account Number: 1001
Account Holder Name: Rahul
```

### Sample Output 5: Wrong PIN

```text
Enter PIN:
1111

Invalid PIN
```

### Sample Output 6: Insufficient Balance

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
3

Enter withdrawal amount:
10000

Insufficient Balance
```

### Sample Output 7: Exit

```text
Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Exit

Enter your choice:
5

Thank you for using the Bank Application
```

## Important Conditions

All instance variables must be private.

Do not access account number, account holder name, PIN, or balance directly from the main method.

Use a constructor to initialize account details.

Use methods to perform login, balance check, deposit, withdrawal, and account detail display.

PIN should not be displayed anywhere in the output.

Deposit amount should be greater than zero.

Withdrawal amount should be greater than zero.

Withdrawal should happen only when sufficient balance is available.

The menu should continue until the user chooses exit.

## Expected Learning Outcome

After completing this project, students should be able to understand how encapsulation works in Java.

They should understand why instance variables are made private.

They should understand how methods are used to safely access and modify private data.

They should also get practice with constructors, objects, method calling, user input, if-else conditions, loops, and switch-case.
