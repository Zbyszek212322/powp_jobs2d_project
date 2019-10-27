package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{

    private int x;
    private int y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        job2dDriver.operateTo(x, y);
    }

    public void setJob2dDriver(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }
}
