package com.yyece.hisserver.entity;


public class Scheduling {

  private long id;
  private long departmentId;
  private String departmentName;
  private long doctorIId;
  private String doctorName;
  private String roomName;
  private long roomId;
  private double cost;
  private long creatorId;
  private String creatorName;
  private java.sql.Time startTime;
  private java.sql.Time endTime;
  private long patientId;
  private String patientName;
  private long status;
  private String chiefComplaint;
  private String examinationResult;
  private String diagnosticResult;
  private String doctorOpinion;
  private long deleted;
  private String note;
  private java.sql.Date date;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public long getDoctorIId() {
    return doctorIId;
  }

  public void setDoctorIId(long doctorIId) {
    this.doctorIId = doctorIId;
  }


  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }


  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }


  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }


  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }


  public long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }


  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }


  public java.sql.Time getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Time startTime) {
    this.startTime = startTime;
  }


  public java.sql.Time getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Time endTime) {
    this.endTime = endTime;
  }


  public long getPatientId() {
    return patientId;
  }

  public void setPatientId(long patientId) {
    this.patientId = patientId;
  }


  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getChiefComplaint() {
    return chiefComplaint;
  }

  public void setChiefComplaint(String chiefComplaint) {
    this.chiefComplaint = chiefComplaint;
  }


  public String getExaminationResult() {
    return examinationResult;
  }

  public void setExaminationResult(String examinationResult) {
    this.examinationResult = examinationResult;
  }


  public String getDiagnosticResult() {
    return diagnosticResult;
  }

  public void setDiagnosticResult(String diagnosticResult) {
    this.diagnosticResult = diagnosticResult;
  }


  public String getDoctorOpinion() {
    return doctorOpinion;
  }

  public void setDoctorOpinion(String doctorOpinion) {
    this.doctorOpinion = doctorOpinion;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }

}
