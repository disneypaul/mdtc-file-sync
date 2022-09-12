package com.fm.mdtc.filesync.domain;

public class JiraFile {
    String filename;
    String size;
    int recordCount;
    String generatedDateTime;
    Boolean uploadedForReporting;
    Boolean uploadedToSharedDrive;

    public JiraFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public String getGeneratedDateTime() {
        return generatedDateTime;
    }

    public void setGeneratedDateTime(String generatedDateTime) {
        this.generatedDateTime = generatedDateTime;
    }

    public Boolean getUploadedForReporting() {
        return uploadedForReporting;
    }

    public void setUploadedForReporting(Boolean uploadedForReporting) {
        this.uploadedForReporting = uploadedForReporting;
    }

    public Boolean getUploadedToSharedDrive() {
        return uploadedToSharedDrive;
    }

    public void setUploadedToSharedDrive(Boolean uploadedToSharedDrive) {
        this.uploadedToSharedDrive = uploadedToSharedDrive;
    }
}
