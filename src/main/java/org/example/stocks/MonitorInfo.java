package org.example.stocks;

public class MonitorInfo {
    public enum Reason{NOT_WORKING, DB_FAILURE, WORKS, FINAL_STAGE}
    private long duration;
    private long otherDuration;
    private Reason reason;
    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getOtherDuration() {
        return otherDuration;
    }

    public void setOtherDuration(long otherDuration) {
        this.otherDuration = otherDuration;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }
}
