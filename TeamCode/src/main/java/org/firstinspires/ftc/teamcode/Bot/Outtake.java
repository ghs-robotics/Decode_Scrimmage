package org.firstinspires.ftc.teamcode.Bot;

import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.FORWARD;
import static com.qualcomm.robotcore.hardware.DcMotorSimple.Direction.REVERSE;

import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Outtake {
    DcMotor out;
    DcMotor out2;

    boolean on;


    public Outtake(HardwareMap hardwareMap, Telemetry telemetry) {

        out = hardwareMap.get(DcMotor.class, "out");
        out2 = hardwareMap.get(DcMotor.class, "out2");
        out.setDirection(REVERSE);
        out2.setDirection(FORWARD);
        this.on = false;
    }

  public void buttonPressing(boolean pressed){
        if(pressed){
            on = !on;
        }
        if (on) {
            out.setPower(1);
            out2.setPower(1);

        }else{
            out.setPower(0);
            out.setPower(0);
        }

  }

}
