package Assignment8.ConcreteElements;

import Assignment8.Element.IDevice;
import Assignment8.Visitor.IVisitor;

public class SecurityCamera implements IDevice{
    private String status;
    private Integer recordingTimeSec;

    public SecurityCamera(String status) {
        this.status = status;
    }

    public SecurityCamera() {}

    public String accept(IVisitor visitor) {
        return visitor.visitSecurityCamera(this);
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRecordingTimeSec() {
        return this.recordingTimeSec;
    }

    public void setRecordingTimeSec(Integer recordingTimeSec) {
        this.recordingTimeSec = recordingTimeSec;
    }
}
