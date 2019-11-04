package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SquareFactory implements ShapesFactory {

    private ComplexCommand complexCommand = new ComplexCommand();

    public DriverCommand drawFigure(DriverManager driverManager) {

        complexCommand.addCommand(new SetPositionCommand(0, 0, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand( 100, 0, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(100, 100, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(0, 100, driverManager.getCurrentDriver()));
        complexCommand.addCommand(new OperateToCommand(0, 0, driverManager.getCurrentDriver()));

        return complexCommand;
    }
}
