/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Climber extends Subsystem {

  private WPI_TalonSRX climbMotor;
  private WPI_TalonSRX climbMotor2;
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Climber(){

    climbMotor = new WPI_TalonSRX(10);
    climbMotor2 = new WPI_TalonSRX(18);
    

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void climbDrive(double speed){
    climbMotor.set(speed);
    climbMotor2.set(-speed);
  }

  
}
