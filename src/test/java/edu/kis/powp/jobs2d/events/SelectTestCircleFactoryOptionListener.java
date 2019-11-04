package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.command.factory.CircleFactory;
import edu.kis.powp.jobs2d.command.factory.ShapesFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestCircleFactoryOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestCircleFactoryOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ShapesFactory shape = new CircleFactory();
        shape.drawFigure(driverManager).execute();
    }
}
