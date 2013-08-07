package com.qsoft.tictactoe;

import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import com.qsoft.tictactoe.ui.MainWindow;

/**
 * User: quynhtq
 * Date: 8/7/13
 * Time: 8:27 AM
 */
public class TicTacToeUIDriver extends JFrameDriver
{
    public TicTacToeUIDriver(int timeoutMillis)
    {
        super(new GesturePerformer(), JFrameDriver.topLevelFrame(named(MainWindow.MAIN_WINDOW_NAME),
                showingOnScreen()), new AWTEventQueueProber(timeoutMillis, 100));
    }
}
