package com.yyece.hisserver.entity;


public class Policy {

  private long id;
  private long creatorId;
  private String creatorName;
  private java.sql.Timestamp createTime;
  private String title;
  private String text;
  private String note;
  private long deleted;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public long getDeleted() {
    return deleted;
  }

  public void setDeleted(long deleted) {
    this.deleted = deleted;
  }

}
