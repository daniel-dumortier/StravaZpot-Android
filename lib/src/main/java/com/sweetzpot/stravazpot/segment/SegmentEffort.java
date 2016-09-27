package com.sweetzpot.stravazpot.segment;

import com.google.gson.annotations.SerializedName;
import com.sweetzpot.stravazpot.common.Distance;
import com.sweetzpot.stravazpot.common.ResourceState;
import com.sweetzpot.stravazpot.common.Time;
import com.sweetzpot.stravazpot.athlete.Athlete;

import java.util.Date;

public class SegmentEffort {
    @SerializedName("id") private long ID;
    @SerializedName("resource_state") private ResourceState resourceState;
    @SerializedName("name") private String name;
    @SerializedName("athlete") private Athlete athlete;
    @SerializedName("elapsed_time") private Time elapsedTime;
    @SerializedName("moving_time") private Time movingTime;
    @SerializedName("start_date") private Date startDate;
    @SerializedName("start_date_local") private Date startDateLocal;
    @SerializedName("distance") private Distance distance;
    @SerializedName("start_index") private int startIndex;
    @SerializedName("end_index") private int endIndex;
    @SerializedName("average_cadence") private float averageCadence;
    @SerializedName("average_watts") private float averageWatts;
    @SerializedName("device_watts") private boolean deviceWatts;
    @SerializedName("average_heartrate") private float averageHeartRate;
    @SerializedName("max_heartrate") private int maxHeartRate;
    @SerializedName("segment") private Segment segment;
    @SerializedName("kom_rank") private int komRank;
    @SerializedName("pr_rank") private int prRank;
    @SerializedName("hidden") private boolean hidden;

    public long getID() {
        return ID;
    }

    public ResourceState getResourceState() {
        return resourceState;
    }

    public String getName() {
        return name;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public Time getElapsedTime() {
        return elapsedTime;
    }

    public Time getMovingTime() {
        return movingTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getStartDateLocal() {
        return startDateLocal;
    }

    public Distance getDistance() {
        return distance;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public float getAverageCadence() {
        return averageCadence;
    }

    public float getAverageWatts() {
        return averageWatts;
    }

    public boolean isDeviceWatts() {
        return deviceWatts;
    }

    public float getAverageHeartRate() {
        return averageHeartRate;
    }

    public int getMaxHeartRate() {
        return maxHeartRate;
    }

    public Segment getSegment() {
        return segment;
    }

    public int getKomRank() {
        return komRank;
    }

    public int getPrRank() {
        return prRank;
    }

    public boolean isHidden() {
        return hidden;
    }
}
