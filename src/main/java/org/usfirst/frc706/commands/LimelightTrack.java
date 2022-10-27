package org.usfirst.frc706.commands;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.usfirst.frc706.Components;
import org.usfirst.frc706.Constants;
import org.usfirst.frc706.IO;
import org.usfirst.frc706.subsystems.Limelight;

import edu.wpi.first.wpilibj.command.Command;

public class LimelightTrack extends Command {
	

	public void execute(){
			 //tracking code

            double x = Limelight.tx.getDouble(0.0);
            double leftPower;
            double rightPower;

            
            if(Math.abs(x)<0.1){         // Case 1: Already close to target
                leftPower = 0;
                rightPower = 0;
            } else if (x==0){            // Case 2: Target not in sight
                rightPower = -0.2;
                leftPower = 0.2;
            } else {                     // Case 3: Target in sight but not close
                rightPower = x/200;
                leftPower = -x/200;
            }



            Components.sparkWheelBL.setPower(leftPower);
            Components.sparkWheelBR.setPower(leftPower);
            Components.sparkWheelFL.setPower(rightPower);
            Components.sparkWheelFR.setPower(rightPower);




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
