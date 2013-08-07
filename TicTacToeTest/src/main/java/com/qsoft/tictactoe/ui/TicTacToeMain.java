package com.qsoft.tictactoe.ui;

import javax.swing.*;

/**
 * User: quynhtq
 * Date: 8/7/13
 * Time: 8:50 AM
 */
public class TicTacToeMain
{
    private MainWindow mainWindow;

    public TicTacToeMain() throws Exception
    {
        startUserInterface();
    }

    public static void main(String args[]) throws Exception
    {
        TicTacToeMain ticTacToeMain = new TicTacToeMain();
    }

    private void startUserInterface() throws Exception
    {
        SwingUtilities.invokeAndWait(new Runnable()
        {
            public void run()
            {
                mainWindow = new MainWindow();
            }
        });
    }
}
