package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@Autonomous(name = "Autonomous_kazuma_test01", group = "Concept")
@Disabled
public class Autonomous_kazuma_test01 extends LinearOpMode{

    @Override
    public void runOpMode(){
        telemetry.addData("Status", "initialized;" );
        telemetry.update();

        waitForStart();

        telemetry.addData("Step1", "Robot would drive forward here");
        telemetry.update();
    }




}
