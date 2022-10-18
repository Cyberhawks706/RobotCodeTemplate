package org.usfirst.frc706.subsystems;




import org.usfirst.frc706.Components;

import org.usfirst.frc706.IO;


import org.usfirst.frc706.commands.Drive;
import org.usfirst.frc706.config.Config;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Chassis extends Subsystem {


	public static boolean piInControl = false;

	public void initDefaultCommand() {
		setDefaultCommand(new Drive());
		
	}

	int valuesAdded = 0;
	double gyroTotal = 0;
	int totalValues = 10;
	
	public double extendOffset = 0;
    public double rotationOffset = 0;

	public void periodic() {
	
		/* 
		if(valuesAdded < totalValues){
			gyroTotal += (double) Components.ahrs.getYaw();
			valuesAdded++;
		}else{
			valuesAdded = 0;
			Config.gyroAngle.value = gyroTotal/ ((double) totalValues);
			gyroTotal = 0;
		}

		if(IO.xboxDrive.getAButtonPressed())Components.ahrs.calibrate();//calibrate when needed
		if(IO.xboxDrive.getYButtonPressed())Components.ahrs.zeroYaw();
		*/

		
		
		


		


		
	}
 
	public double previousAngle = 0;

	public void zeroAllMotors() {

	}
	public void Drive(double leftSpeed, double rightSpeed) {
		
	}

	public void ShootyShoot(double leftSpeed, double rightSpeed){

	}
}
