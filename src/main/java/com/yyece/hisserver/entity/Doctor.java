package com.yyece.hisserver.entity;


public class Doctor {

  private Integer id;
  private String account;
  private String name;
  private String password;
  private String skilledField;
  private long departmentId;
  private String departmentName;
  private String practiceExperience;
  private String head;
  private long deleted;
  private long titleId;
  private String titleName;


  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSkilledField() {
    return skilledField;
  }

  public void setSkilledField(String skilledField) {
    this.skilledField = skilledField;
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


  public String getPracticeExperience() {
    return practiceExperience;
  }

  public void setPracticeExperience(String practiceExperience) {
    this.practiceExperience = practiceExperience;
  }


  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }


  public long getTitleId() {
    return titleId;
  }

  public void setTitleId(long titleId) {
    this.titleId = titleId;
  }


  public String getTitleName() {
    return titleName;
  }

  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }

}
