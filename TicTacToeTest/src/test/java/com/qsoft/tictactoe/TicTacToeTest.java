package com.qsoft.tictactoe;

import org.junit.Test;

/**
 * User: quynhtq
 * Date: 8/7/13
 * Time: 8:05 AM
 */
public class TicTacToeTest
{
    private ApplicationRunner applicationRunner = new ApplicationRunner();

    @Test
    public void testJustStartAndStopGame()
    {
        applicationRunner.startGame();
        applicationRunner.hasLabelWithNameGameStarted();
        applicationRunner.stopGame();
        applicationRunner.hasLabelInUIWithNameGameStopped();
    }
}
