package OldAutonomous;

import static org.firstinspires.ftc.teamcode.Variables.globalTargetRotation;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

import org.firstinspires.ftc.teamcode.DriveMethods;
import org.firstinspires.ftc.teamcode.Variables;

@Autonomous(name ="BBMid", group = "A")
@Disabled
public class BBMid extends DriveMethods {
    //good
    public void runOpMode() {
        globalTargetRotation = 0;
        initMotorsBlue();

        clawClamp();
        sleep(500);
        waitForStart();

        GoToHeight(300);

        driveForDistance(0.65, Variables.Direction.LEFT,0.35, globalTargetRotation);
        driveForDistance(0.6, Variables.Direction.FORWARD,0.35, globalTargetRotation);
        driveForDistance(0.33, Variables.Direction.RIGHT, 0.35, globalTargetRotation);
        goToMid();
        sleep(500);
        driveForDistance(0.15, Variables.Direction.FORWARD,0.35, globalTargetRotation);
        clawRelease();
        sleep(200);
        driveForDistance(0.15, Variables.Direction.BACKWARD,0.35, globalTargetRotation);
        goToDown();
        sleep(500);
        driveForDistance(0.33, Variables.Direction.LEFT, 0.35, globalTargetRotation);
        driveForDistance(0.6, Variables.Direction.BACKWARD,0.35, globalTargetRotation);
        driveForDistance(1.5, Variables.Direction.RIGHT,0.35, globalTargetRotation);

        while (opModeIsActive()) {

        }
    }
}

