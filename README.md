# Assignment-2-Design-Principles

The objective of this assignment is to practice the software design and apply the
design principles in your code.
The problem:
You are required to design and implement a small application for a company that
manages the following user structure:
● Director: Has a list of Managers and Staff.
● Manager: Has a list of Staff.
● Staff
All users in the system share common attributes, which include ID, name, age, hourly
rate, and the total number of completed hours for each month.
The application's primary tasks are to generate a set of reports, including:
● A list of staff for each Director or Manager.
● The required budget for each Manager or Director.
The system should be flexible to allow for the addition of new reports. To enhance report
generation, template stores for the reports should be created, and these template stores
should be used to create new reports.
Data should be stored in a database (fake DB) and retrieved from it. Your code should
ensure that only one connection is open for each user


# Main Class
It creates instances of Directors, Managers, and Staff, adds them to the FakeDB, generates reports, and calculates budgets.

# User Interface
defines common attributes and methods shared by all users.

# calculat Interface
We use it to achieve the Open-Closed Principle and Dependency Inversion Principle. 

# FakeDB Class
It is an imitation of real data pieces and is used to store and retrieve data
and Here we used HashMap instead of ArrayList to save user data.


# Director Class
Directors can have a list of Managers as subordinates.

# Manager Class
Managers can have a list of Staff as subordinates. 

# Staff Class
Represents a Staff member and contains attributes specific to Staff.

# BudgetCalculator
calculating the budget based on the hourly rate and completed hours
This equation is present in the staff and the manger and is called upon in this class (hourlyrate * totalhours;).

# Report Class
checks the type of user (Director or Manager) and generates reports accordingly.

