package com.virtusa.web;
public class Patient {
	
    public int id;
    public String password;
    public String name;
    public int phno;
    public int heartrate;
    public int bloodpressure;
    public int temperature;
    public int doctorid;
    public boolean isValid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getHeartrate() {
		return heartrate;
	}
	public void setHeartrate(int heartrate) {
		this.heartrate = heartrate;
	}
	public int getBloodpressure() {
		return bloodpressure;
	}
	public void setBloodpressure(int bloodpressure) {
		this.bloodpressure = bloodpressure;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	@Override
	public String toString() {
		return "PatientDao [id=" + id + ", name= " + name + ", phno=" + phno + ", heartrate=" + heartrate
				+ ", bloodpressure=" + bloodpressure + ", temperature=" + temperature + ", doctorid=" + doctorid + "]";
	}
	
    
    
}