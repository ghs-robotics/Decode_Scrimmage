package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.Servo;

public class servo {
    Servo servoBotPart;


    public servo(HardwareMap hardwareMap, Telemetry telemetry) {
        servoBotPart = hardwareMap.get(Servo.class, "servoBotPart");
    }

    public void move(double lf){
        servoBotPart.setPosition(lf);
    }

}

