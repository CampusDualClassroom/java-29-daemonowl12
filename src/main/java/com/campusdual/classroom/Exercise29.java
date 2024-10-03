package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {

        try {
            throw new RuntimeException("This is a controlled test exception");
        } catch (RuntimeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

    }

}
