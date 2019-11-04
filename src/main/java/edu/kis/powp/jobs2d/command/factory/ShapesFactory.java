package edu.kis.powp.jobs2d.command.factory;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public interface ShapesFactory {

    DriverCommand drawFigure(DriverManager driverManager);
}
