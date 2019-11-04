package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

import java.util.ArrayList;
import java.util.List;

/**
 * Plotter test.
 *
 * @author Dominik
 */
public class DriverCommandTest {

    private static Job2dDriver driver = new StubDriver();

    /**
     * Driver test.
     */
    public static void main(String[] args) {

        DriverCommand operateToCommand = new OperateToCommand(1, 2, driver);
        operateToCommand.execute();

        DriverCommand setPositionCommand = new SetPositionCommand(3, 4, driver);
        setPositionCommand.execute();

    }

    private static class StubDriver implements Job2dDriver {

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Driver operateTo action... " + x + ", " + y);
        }

        @Override
        public void setPosition(int x, int y) {
            System.out.println("Driver setPosition action... " + x + ", " + y);
        }
    };
}

