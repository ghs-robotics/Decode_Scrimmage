package org.firstinspires.ftc.teamcode.Bot;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake {
    // declare physical parts such as motors and servos here
    DcMotor motor;


    // Add parts to hardware map here
    // the names in perenthesis dont have to be the same as the object name
    // but it determines the name in configuration on the Driver Station
    public Intake(HardwareMap hardwareMap, Telemetry telemetry){
        motor = hardwareMap.get(DcMotor.class,"in");
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    // add all Class code here
    public void turnOn(boolean reverse, boolean forward){
        if(reverse) {
            motor.setPower(-1);
        } else if(forward){
            motor.setPower(1);
        } else {
            motor.setPower(0);
        }
    }


}
