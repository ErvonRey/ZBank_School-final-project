# OOP_FinalSystem

The Mini Banking System or ZBank

The Mini Banking System is a Java-based application designed to simulate the core operations of a real-world digital banking platform.
It utilizes MySQL as its database backend and follows structured programming and OOP principles to ensure clarity, maintainability, and scalability.

The system allows users to create accounts, log in securely, and manage their personal funds through different banking features.
User data, balances, and transaction records are stored in a database to ensure persistence and accuracy.

Key Features

1. Account Management
- Users can create and register new accounts.
- Login authentication using stored credentials.
- Session handling ensures actions are performed under the correct user ID.
- Users can delete their accounts if desired.

2. Balance Handling

- The system retrieves user balance directly from the database using secure SQL queries.
- Balance updates are automatically saved after each transaction.
- Error handling ensures database failures don’t crash the system.

3. Money Transactions
   
- Deposit
    Users can add funds to their account.
    Each deposit is logged in the transaction history table.

- Withdraw
    Users can withdraw money with validation checks:
    No overdrafts
    Sufficient balance required

- Send Money
    Users can transfer money to another account.
    The system automatically subtracts from the sender and adds to the receiver.
    Each transfer is fully recorded in the transaction log.

4. Investment System

- Users can invest money for a chosen duration.
- Uses simple interest at a fixed 0.03% per month.
- Investement balance is locked until the selected duration ends to prevent bugs.
- Users can simulate time (day/week/month/year) to see investment growth.
- Completed investments can be claimed and added back to the user’s balance.

5. Transaction History

- Shows all past deposits, withdrawals, transfers, and investment claims.
- Pulled from MySQL for accurate, permanent records.

6. User Interface

- GUI built using Java Swing and JFrame.
- Dark theme for modern and clean visual experience.
- Pop-up messages (JOptionPane) display errors, confirmations, and warnings.

Overall Summary
  The Mini Banking System functions as a simplified but realistic digital bank with account management,
  live database-backed balance handling, complete transaction logging, and an investment module.
  The system design prioritizes accuracy, data integrity, and a user-friendly interface—making it an excellent
  foundation for expanding into a full financial platform in the future.
