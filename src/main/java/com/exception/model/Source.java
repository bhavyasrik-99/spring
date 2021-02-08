package com.exception.model;
import javax.validation.constraints.NotEmpty;
public class Source {
@NotEmpty(message = "Name must not be empty")
private String name;
// non empty string for name 
private String id;
public String getId() {
return id;
}
public void setId(String id) {
this.id = id;
}
public Source(String name, String id) {
	super();
	this.name = name;
	this.id = id;
}
public Source() {
	super();
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
}
