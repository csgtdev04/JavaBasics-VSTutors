package Basics;

import java.util.Scanner;

import OOPs.Person;

public class ToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Sai", 17);
        System.out.println(person);
    }
}