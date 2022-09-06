package com.company;

import static com.company.InputValidator.inputValues;
import static com.company.Printer.drawChessBoard;

public class Main {

    public static void main(String[] args) {
        drawChessBoard(5, 5);
        drawChessBoard(-1, 0);
        inputValues();
    }
}
