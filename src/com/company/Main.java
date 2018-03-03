package com.company;

public class Main {

    public static void main(String[] args) {
        TestInterface message = new GoedenDag();
        message.print();

        message = new TotZiens();
        message.print();
    }
}
