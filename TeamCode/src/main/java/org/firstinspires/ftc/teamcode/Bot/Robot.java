package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {
    public HardwareMap hardwareMap;
    public Telemetry telemetry;
    public MecanumDrive drive;

    public Outtake outtake;

    //public exampleBotPart part;

    // add all parts of the bot here in the form of  public
    // ( the name of the class) (what you name the class object).


    //public servo servo;
    public Intake intake;
    public Robot(HardwareMap hardwareMap, Telemetry telemetry) {
        this.hardwareMap = hardwareMap;
        this.telemetry = telemetry;
        drive = new MecanumDrive(hardwareMap, telemetry);
        outtake = new Outtake(hardwareMap, telemetry);
        //part = new exampleBotPart(hardwareMap, telemetry);
        // add parts here in the form of
        // (what you name the class object) = new ( the name of the class)(all parameters of the class).
        // the parameters should include hardware map and telemetry.
       // servo = new servo(hardwareMap, telemetry);
        intake = new Intake(hardwareMap, telemetry);
    }
}