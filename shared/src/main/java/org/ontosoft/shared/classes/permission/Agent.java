package org.ontosoft.shared.classes.permission;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Agent {
  String id;
  
  @JsonIgnore
  String name;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
    this.name = id.replaceAll(".*\\/", "");
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
}
