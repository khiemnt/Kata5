package com.qsoft.tictactoe.ui;

import javax.swing.*;

/**
 * User: quynhtq
 * Date: 8/7/13
 * Time: 8:42 AM
 */
public class MainWindow extends JFrame
{
    public static final String MAIN_WINDOW_NAME = "TicTacToeMain";
    public MainWindow()
    {
        super("Tic-tac-toe");
        setName(MAIN_WINDOW_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
