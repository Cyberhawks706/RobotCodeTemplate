package org.usfirst.frc706.commands;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.usfirst.frc706.Components;
import org.usfirst.frc706.Constants;
import org.usfirst.frc706.IO;

import edu.wpi.first.wpilibj.command.Command;

public class CameraIdentifier extends Command {
	


    int r = 600; // # of pixes in row
    int c = 800; // # of pixes in column
    int i,j;

	

	public void execute(){

        for(i = 0; i++; i<r){
            
        }

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
