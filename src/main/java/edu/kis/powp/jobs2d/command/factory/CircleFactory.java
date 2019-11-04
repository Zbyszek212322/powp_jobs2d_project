package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class CircleFactory implements ShapesFactory {

    private ComplexCommand complexCommand = new ComplexCommand();
    private final int RADIUS = 150;

    public DriverCommand drawFigure(DriverManager driverManager) {

        complexCommand.addCommand(new SetPositionCommand(RADIUS, 0, driverManager.getCurrentDriver()));

        for (double i = 0.0; i < 360; i += 0.1) {

            Double y = Math.sin(i) * RADIUS;
            Double x = Math.cos(i) * RADIUS;

            complexCommand.addCommand(new OperateToCommand( x.intValue(), y.intValue(), driverManager.getCurrentDriver()));
        }

        return complexCommand;
    }
}
