package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Gamepads.Controller;
import org.firstinspires.ftc.teamcode.Bot.Robot;

@TeleOp
public class Tele extends LinearOpMode {


    Robot robot;
    Controller gp1;
    Controller gp2;


    @Override
    public void runOpMode() throws InterruptedException {

        robot = new Robot(hardwareMap, telemetry);
        gp1 = new Controller(gamepad1);
        gp2 = new Controller(gamepad2);

        waitForStart();

        // Tele Init code

        while (opModeIsActive()) {
            gp1.update();
            gp2.update();

            // all code should go into its respective gamepad location.

            //-------------------------------------------------------------------------------------
            //                                  GAMEPAD 1
            //robot.servo.move(gp1.left_stick_x);
            //-------------------------------------------------------------------------------------
            robot.drive.calculateDrivePowers(gp1.left_stick_x,gp1.left_stick_y,gp1.right_stick_x);
            robot.intake.turnOn(gp1.x.pressing(), gp1.b.pressing());
            //-------------------------------------------------------------------------------------
            //                                  GAMEPAD 2
            robot.outtake.buttonPressing(gp2.a.pressing()); //button for outtake
            //-------------------------------------------------------------------------------------
            //-------------------------------------------------------------------------------------
            //                                  AUTOMATIC
            //-------------------------------------------------------------------------------------

            //-------------------------------------------------------------------------------------
            //                                  TELEMETRY
            //-------------------------------------------------------------------------------------

            telemetry.update();

        }
    }
}
