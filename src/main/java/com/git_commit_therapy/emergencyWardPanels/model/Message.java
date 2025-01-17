package com.git_commit_therapy.emergencyWardPanels.model;

import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Message {
    private String inVisiting;
    private String needToBeVisited;
    private String lastPatientsCalled;
}


