package com.qsoft.tictactoe;

import com.qsoft.tictactoe.ui.MainWindow;
import com.qsoft.tictactoe.ui.TicTacToeMain;

/**
 * User: quynhtq
 * Date: 8/7/13
 * Time: 8:25 AM
 */
public class ApplicationRunner
{
    private TicTacToeUIDriver ticTacToeUIDriver;

    public void startGame()
    {
        Thread thread = new Thread("Test Tic-tac-toe"){
            @Override
            public void run()
            {
                try
                {
                    TicTacToeMain.main(null);
                }
                catch (Exception e)
                {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        };
        thread.setDaemon(true);
        thread.start();
        ticTacToeUIDriver = new TicTacToeUIDriver(1000);
    }

    public void hasLabelWithNameGameStarted()
    {
        ticTacToeUIDriver.hasTitle(MainWindow.MAIN_WINDOW_NAME);
    }

    public void stopGame()
    {

    }

    public void hasLabelInUIWithNameGameStopped()
    {

    }
}
