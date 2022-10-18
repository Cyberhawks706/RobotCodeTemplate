package org.usfirst.frc706.config;



import edu.wpi.first.wpilibj.DriverStation;

public final class Config {

   public static ConfigurableBool testBool = new ConfigurableBool("TESTBOOL", true);
   public static ConfigurableNumber testNumber = new ConfigurableNumber("TESTNUMBER", 0);
   public static ConfigurableString testString = new ConfigurableString("TESTSTRING", "TRUE");

   }