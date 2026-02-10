package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class exampleBotPart {
    // declare physical parts such as motors and servos here
    DcMotor motor;
    Servo servo;

    // Add parts to hardware map here
    // the names in perenthesis dont have to be the same as the object name
    // but it determines the name in configuration on the Driver Station
    public exampleBotPart(HardwareMap hardwareMap, Telemetry telemetry){
        motor = hardwareMap.get(DcMotor.class,"motorName");
        servo = hardwareMap.get(Servo.class, "servoName");
    }

    // add all Class code here

}
