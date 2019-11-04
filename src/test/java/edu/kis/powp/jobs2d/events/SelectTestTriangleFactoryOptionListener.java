package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.factory.ShapesFactory;
import edu.kis.powp.jobs2d.command.factory.TriangleFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestTriangleFactoryOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestTriangleFactoryOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ShapesFactory shape = new TriangleFactory();
        shape.drawFigure(driverManager).execute();
    }
}
