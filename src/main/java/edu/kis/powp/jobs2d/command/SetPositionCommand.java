package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{

    private int x;
    private int y;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(int x, int y, Job2dDriver currentDriver)
    {
        this.x = x;
        this.y = y;
        this.job2dDriver = currentDriver;
    }

    @Override
    public void execute() {
        job2dDriver.setPosition(x, y);
    }

}
