package org.firstinspires.ftc.teamcode.common;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

// Class for a simple competition bot
// Includes:
//          one-motor lift with no PID controller
//          servo grabber
public class BotBasic extends Component {
    private LiftBasic lift = null;
    private Servo grabber = null;
    private double grabberOpenPos = 0.0;
    private double grabberClosePos = 1.0;

    public BotBasic(HardwareMap hardwareMap, Telemetry telemetry) {
        super(telemetry);

        lift = new LiftBasic(hardwareMap, telemetry);
        grabber = hardwareMap.get(Servo.class, "grabber");
        grabber.setPosition(grabberClosePos);
    }

    public void liftUp(double power) {
        lift.up(power);
    }

    public void liftDown(double power) {
        lift.down(power);
    }

    public void liftStop() {
        lift.stop();
    }

    public void grabberOpen() {
        grabber.setPosition(grabberOpenPos);
    }

    public void grabberClose() {
        grabber.setPosition(grabberClosePos);
    }

    public void log() {
        lift.log();
    }

    public void update() {
        lift.update();
    }
}
