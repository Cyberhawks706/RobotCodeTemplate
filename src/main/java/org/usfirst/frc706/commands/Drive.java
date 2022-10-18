package org.usfirst.frc706.commands;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.usfirst.frc706.Components;
import org.usfirst.frc706.Constants;
import org.usfirst.frc706.IO;

import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	

	public Drive() {
		requires(Components.chassis);
	}

	public double zero(double XboxValue, double DeadZone){
		double xboxValue = XboxValue;
		if(Math.abs(xboxValue)<DeadZone){
				xboxValue = 0;
			}

		return xboxValue;
	}

	public void execute(){
			 //DRIVE CODE!!
			
			//Adding DeadZone
			double xboxX = this.zero(IO.xboxDrive.getLeftY(), Constants.IO.xboxDeadband);
			double xboxY = this.zero(IO.xboxDrive.getLeftX(), Constants.IO.xboxDeadband);
			double xboxT = this.zero(IO.xboxDrive.getRightX(), Constants.IO.xboxDeadband);

			//Drive 
			double xboxRightJoyX = (IO.xboxDrive.getRightX() - 0.5)*2;
			double xboxRightJoyY = (IO.xboxDrive.getRightY() - 0.5)*2;
			double xboxLeftJoyX = IO.xboxDrive.getLeftX() - 0.5;

			double driveAngle = 0;
			double power = Math.sqrt(Math.pow(xboxRightJoyX, 2) + Math.pow(xboxRightJoyY, 2))/1;
		
			if(xboxRightJoyX != 0 && xboxRightJoyY != 0){
			driveAngle = Math.tan(xboxRightJoyY/xboxRightJoyX)+(Math.PI/2);
			}
		
			if(driveAngle > Math.PI){
			driveAngle = driveAngle%(Math.PI);
			} else if ( driveAngle < 0){
			driveAngle = driveAngle%(Math.PI) + (Math.PI);
			}

			Components.sparkWheelTurnFR.setPos(driveAngle/(2*Math.PI));
			Components.sparkWheelTurnFL.setPos(driveAngle/(2*Math.PI));
			Components.sparkWheelTurnBR.setPos(driveAngle/(2*Math.PI));
			Components.sparkWheelTurnBL.setPos(driveAngle/(2*Math.PI));

			Components.sparkWheelFR.setVel(power);
			Components.sparkWheelFL.setVel(power);
			Components.sparkWheelBR.setVel(power);
			Components.sparkWheelBL.setVel(power);

	}

	protected void initialize() {
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
	}

	protected void interrupted() {
	}
}
