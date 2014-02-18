package com.muzima.api.model;

import java.util.Date;

/*
This structure is going to hold the last sync time for the API along with its param signature. Useful to make the
 */
public class LastSyncTime extends OpenmrsSearchable implements Comparable<LastSyncTime>{

    private APIName apiName;
    private String paramSignature;
    private Date lastSyncDate;

    public APIName getApiName() {
        return apiName;
    }

    public void setApiName(APIName apiName) {
        this.apiName = apiName;
    }

    public String getParamSignature() {
        return paramSignature;
    }

    public void setParamSignature(String paramSignature) {
        this.paramSignature = paramSignature;
    }

    public Date getLastSyncDate() {
        return lastSyncDate;
    }

    public void setLastSyncDate(Date lastSyncDate) {
        this.lastSyncDate = lastSyncDate;
    }

    @Override
    public int compareTo(LastSyncTime lastSyncTime) {
        return this.lastSyncDate.compareTo(lastSyncTime.lastSyncDate);
    }
}