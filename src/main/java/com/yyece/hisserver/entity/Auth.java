package com.yyece.hisserver.entity;


public class Auth {

  private long id;
  private String name;
  private long creatorId;
  private String creatorName;
  private String code;
  private long deleted;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }

}
