package com.xworkz.mips.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TransactionDTO implements Serializable {

	private String facilityId;
    private String patientFirstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String npi;
    private String street;
    private String city;
    private String state;
    private String postCode;
    private String address;
    private String errorDetail;
    private String totalPrescriptions;
    private String status;
    private String ehrUsername;
    private String requestTrackingId;
    private String provFirstName;
    private String provLastName;
    private String provDEA;
    private String provNPI;
    private String stateLICNo;
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public String getProvFirstName() {
        return provFirstName;
    }

    public void setProvFirstName(String provFirstName) {
        this.provFirstName = provFirstName;
    }

    public String getProvLastName() {
        return provLastName;
    }

    public void setProvLastName(String provLastName) {
        this.provLastName = provLastName;
    }

    public String getProvDEA() {
        return provDEA;
    }

    public void setProvDEA(String provDEA) {
        this.provDEA = provDEA;
    }

    public String getProvNPI() {
        return provNPI;
    }

    public void setProvNPI(String provNPI) {
        this.provNPI = provNPI;
    }

    public String getStateLICNo() {
        return stateLICNo;
    }

    public void setStateLICNo(String stateLICNo) {
        this.stateLICNo = stateLICNo;
    }
    
    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getFirstName() {
        return patientFirstName;
    }

    public void setFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNpi() {
        return npi;
    }

    public void setNpi(String npi) {
        this.npi = npi;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    public String getTotalPrescriptions() {
        return totalPrescriptions;
    }

    public void setTotalPrescriptions(String totalPrescriptions) {
        this.totalPrescriptions = totalPrescriptions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEhrUsername() {
        return ehrUsername;
    }

    public void setEhrUsername(String ehrUsername) {
        this.ehrUsername = ehrUsername;
    }

    public String getRequestTrackingID() {
        return requestTrackingId;
    }

    public void setRequestTrackingID(String requestTrackingId) {
        this.requestTrackingId = requestTrackingId;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" + "facilityId=" + facilityId + ", patientFirstName=" + patientFirstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", npi=" + npi + ", street=" + street + ", city=" + city + ", state=" + state + ", postCode=" + postCode + ", address=" + address + ", errorDetail=" + errorDetail + ", totalPrescriptions=" + totalPrescriptions + ", status=" + status + ", ehrUsername=" + ehrUsername + ", requestTrackingId=" + requestTrackingId + ", provFirstName=" + provFirstName + ", provLastName=" + provLastName + ", provDEA=" + provDEA + ", provNPI=" + provNPI + ", startTime=" + startTime + ", endTime=" + endTime + ", stateLICNo=" + stateLICNo + '}';
    }
}
