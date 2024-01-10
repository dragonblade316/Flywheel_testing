package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class FlyWheelMotorsSubsystem extends SubsystemBase {

    CANSparkMax motor1 = new CANSparkMax(8, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax motor2 = new CANSparkMax(13, CANSparkMaxLowLevel.MotorType.kBrushless);
    public FlyWheelMotorsSubsystem() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
    }

    public void set(double motor1, double motor2) {
        this.motor1.set(motor1);
        this.motor2.set(motor2);
    }
}

