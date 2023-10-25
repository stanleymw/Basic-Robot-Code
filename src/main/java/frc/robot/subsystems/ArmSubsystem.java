// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
	/** Creates a new ArmSubsystem. */
  private final CANSparkMax armMotorController1;
  private final CANSparkMax armMotorController2;

	public ArmSubsystem() {
    this.armMotorController1 = new CANSparkMax(1, MotorType.kBrushless);
    this.armMotorController2 = new CANSparkMax(2, MotorType.kBrushless);
  }

  public void setArmController1Speed(double speed) {
    this.armMotorController1.set(speed);
  }

  public void setArmController2Speed(double speed) {
    this.armMotorController2.set(speed);
  }

  public void setBothArmControllerSpeed(double speed1, double speed2) {
    setArmController1Speed(speed1);
    setArmController2Speed(speed2);
  }

	@Override
	public void periodic() {
		// This method will be called once per scheduler run
	}

	@Override
	public void simulationPeriodic() {
		// This method will be called once per scheduler run during simulation
	}
}
