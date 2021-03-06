// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import java.util.ArrayList;
import java.util.List;

import org.photonvision.PhotonCamera;
import org.photonvision.SimPhotonCamera;
import org.photonvision.targeting.PhotonTrackedTarget;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  //PhotonCamera limelight = new PhotonCamera("gloworm");
  SimPhotonCamera limelightSim = new SimPhotonCamera("gloworm");

  @Override
  public void robotPeriodic() {
    //limelightSim.submitProcessedFrame(0, new ArrayList<PhotonTrackedTarget>());
  }
}