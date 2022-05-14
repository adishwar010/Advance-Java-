package com.hib.demo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table (name = "Address_Info")
public class Address
{
@Id
@GeneratedValue
private int addressID;
@Column (name = "Street_Name")
private String street;
private String district;
@Column(length = 6)
private String pincode;
@Transient
private String landmarks;
private boolean permanent;
@Temporal(TemporalType.DATE)
private Date addeddate;
public Address() {
super();
// TODO Auto-generated constructor stub
}
public Address(int addressID, String street, String district, String pincode, String
landmarks, boolean permanent,
Date addeddate) {
super();
this.addressID = addressID;
this.street = street;
this.district = district;
this.pincode = pincode;
this.landmarks = landmarks;
this.permanent = permanent;
this.addeddate = addeddate;
}
public int getAddressID() {
return addressID;
}
public void setAddressID(int addressID) {

this.addressID = addressID;
}
public String getStreet() {
return street;
}
public void setStreet(String street) {
this.street = street;
}
public String getDistrict() {
return district;
}
public void setDistrict(String district) {
this.district = district;
}
public String getPincode() {
return pincode;
}
public void setPincode(String pincode) {
this.pincode = pincode;
}
public String getLandmarks() {
return landmarks;
}
public void setLandmarks(String landmarks) {
this.landmarks = landmarks;
}
public boolean isPermanent() {
return permanent;
}
public void setPermanent(boolean permanent) {
this.permanent = permanent;
}
public Date getAddeddate() {
return addeddate;
}
public void setAddeddate(Date addeddate) {
this.addeddate = addeddate;
}
}