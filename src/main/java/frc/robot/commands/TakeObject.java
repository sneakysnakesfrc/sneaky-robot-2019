/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TakeObject extends Command {
  public TakeObject() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_intake);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.m_intake.intakeState == "CARGO"){
      Robot.m_intake.intakeDrive(-0.6);
    }
    else if(Robot.m_intake.intakeState == "HATCH"){
      Robot.m_intake.intakeDrive(-0.6);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    if(Robot.m_intake.intakeState == "HATCH"){
      Robot.m_intake.intakeDrive(0);
    }
    else{
      Robot.m_intake.intakeDrive(0);
    }
   
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    if(Robot.m_intake.intakeState == "HATCH"){
      Robot.m_intake.intakeDrive(0);
    }
    else{
      end();
    }
    
  }
}
