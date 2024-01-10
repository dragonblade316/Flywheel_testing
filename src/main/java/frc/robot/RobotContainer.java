// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.RunMotorsCommand;
import frc.robot.subsystems.FlyWheelMotorsSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  Joystick joy = new Joystick(0);
  JoystickButton trigger = new JoystickButton(joy, 0);


  SendableChooser<Double> right = new SendableChooser<Double>();
  SendableChooser<Double> left = new SendableChooser<Double>();
  

  
  FlyWheelMotorsSubsystem subsystem = new FlyWheelMotorsSubsystem();

  RunMotorsCommand command = new RunMotorsCommand(subsystem, right, left);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    left.setDefaultOption("1", 1.0);
    left.addOption("0.75", 0.75);
    left.addOption("0.5", 0.5);
    left.addOption("0.25", 0.25);
    left.addOption("0", 0.0);

    right.setDefaultOption("1", 1.0);
    right.addOption("0.75", 0.75);
    right.addOption("0.5", 0.5);
    right.addOption("0.25", 0.25);
    right.addOption("0", 0.0);



    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
    trigger.onTrue(command);

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}

