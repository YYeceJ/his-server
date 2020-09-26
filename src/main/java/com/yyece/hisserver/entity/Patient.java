package com.yyece.hisserver.entity;


public class Patient {

  private long id;
  private String phone;
  private String name;
  private String password;
  private long gender;
  private java.sql.Timestamp birthDate;
  private String note;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public java.sql.Timestamp getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(java.sql.Timestamp birthDate) {
    this.birthDate = birthDate;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}
