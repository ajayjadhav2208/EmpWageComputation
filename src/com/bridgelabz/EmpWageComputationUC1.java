package com.bridgelabz;

public class EmpWageComputationUC1 {

    public static void main(String[] args) {
        System.out.println("Welcome to the EmpWageComputation");
        int CheckEmp = (int) Math.floor(Math.random() * 10 % 2);
        if (CheckEmp == 1)
            System.out.println("Employee is not present");
        else
            System.out.println("Employee is present");
    }
}
