package com.yyece.hisserver.entity;


public class Role {

  private long id;
  private String name;
  private String creatorName;
  private long creatorId;
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


  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }


  public long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(long creatorId) {
    this.creatorId = creatorId;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }

}
