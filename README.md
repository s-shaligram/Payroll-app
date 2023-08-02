# Payroll Management System

## Table of Contents

1. [Introduction](#introduction)
2. [Project Overview](#project-overview)
3. [Class Descriptions](#class-descriptions)
    - [Employee](#employee-class)
    - [Payroll](#payroll-class)
    - [Supervisor](#supervisor-class)
    - [TeamLeader](#teamleader-class)
    - [Worker](#worker-class)
4. [How to Use](#how-to-use)
5. [Contributors](#contributors)

## 1. Introduction

This project is a Java-based Payroll Management System. It allows users to manage payroll calculations for different types of employees in an organization. The project demonstrates object-oriented programming principles, including inheritance, abstraction, and polymorphism.

## 2. Project Overview

The Payroll Management System consists of several Java classes to handle various functionalities:

- `Employee`: An abstract superclass that holds common features of all employee types.
- `Payroll`: A class responsible for calculating the net pay for any `Employee` object.
- `Supervisor`: A subclass of `Employee` representing a supervisor role with salary and production rate.
- `TeamLeader`: A subclass of `Worker` representing a team leader role with completed training and a bonus.
- `Worker`: A subclass of `Employee` representing a regular worker with shift, hourly rate, and hours worked.

## 3. Class Descriptions

### Employee Class

The `Employee` class is an abstract superclass that holds common attributes like level, first name, last name, hire date, birth date, and an automatically generated unique employee number. It also defines an abstract method `calculatePay()` to calculate weekly gross pay for subclasses.

### Payroll Class

The `Payroll` class is responsible for calculating the net pay for an `Employee` object. It includes methods to calculate various deductions and contributions from an employee's weekly pay.

### Supervisor Class

The `Supervisor` class is a subclass of `Employee` representing a supervisor role. It includes attributes for salary and production rate, as well as a method to calculate the bonus earned based on the production rate.

### TeamLeader Class

The `TeamLeader` class is a subclass of `Worker` representing a team leader role. It includes attributes for completed training, required training hours, and a monthly bonus. It overrides the `calculatePay()` method from the parent class to add additional pay.

### Worker Class

The `Worker` class is a subclass of `Employee` representing a regular worker role. It includes attributes for shift, hourly rate, and hours worked. The `calculatePay()` method is implemented to calculate the pay based on the shift and hours worked.

## 4. How to Use

To use the Payroll Management System, you can follow these steps:

1. Instantiate objects for different employee types (Supervisor, TeamLeader, Worker) with relevant details.
2. Use the `Payroll` class to calculate the net pay for each employee.
3. Print reports to view the details of each employee and their net pay.
4. Update employee details for the next pay period and recalculate net pay.

## 5. Contributors

- Sameer Shaligram (https://github.com/s-shaligram) - Developer

---

*This project was created as a part of Java Course.*
