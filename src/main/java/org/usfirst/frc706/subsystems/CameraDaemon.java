package org.usfirst.frc706.subsystems;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.cscore.VideoSink;
import edu.wpi.first.cscore.VideoSource.ConnectionStrategy;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CameraDaemon extends Subsystem{

    public static UsbCamera cam1;
    public static UsbCamera cam2;


    
    public static void robotInit() {
        cam1 = CameraServer.startAutomaticCapture(0); //Need to start this in Robot.java
        cam2 = CameraServer.startAutomaticCapture(1); //Need to start this in Robot.java
        
    }


    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub
        
    }
}
