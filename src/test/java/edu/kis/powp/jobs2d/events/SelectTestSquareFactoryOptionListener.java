package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.factory.ShapesFactory;
import edu.kis.powp.jobs2d.command.factory.SquareFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestSquareFactoryOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestSquareFactoryOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ShapesFactory shape = new SquareFactory();
        shape.drawFigure(driverManager).execute();
    }
}
