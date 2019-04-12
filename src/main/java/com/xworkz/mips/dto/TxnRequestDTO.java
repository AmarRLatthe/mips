package com.xworkz.mips.dto;

import java.io.Serializable;

public class TxnRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stateCode;
    private String userRole;
    private String facilityId;
    private String providerDEA;
    private String providerNPI;
    private String providerStateLicNo;
    private String ehrUserName;
    
    public TxnRequestDTO() {
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getProviderDEA() {
        return providerDEA;
    }

    public void setProviderDEA(String providerDEA) {
        this.providerDEA = providerDEA;
    }

    public String getProviderNPI() {
        return providerNPI;
    }

    public void setProviderNPI(String providerNPI) {
        this.providerNPI = providerNPI;
    }

    public String getProviderStateLicNo() {
        return providerStateLicNo;
    }

    public void setProviderStateLicNo(String providerStateLicNo) {
        this.providerStateLicNo = providerStateLicNo;
    }

    @Override
    public String toString() {
        return "TxnRequestDTO{" + "stateCode=" + stateCode + ", userRole=" + userRole + ", facilityId=" + facilityId + ", providerDEA=" + providerDEA + ", providerNPI=" + providerNPI + ", providerStateLicNo=" + providerStateLicNo + '}';
    }

	public String getEhrUserName() {
		return ehrUserName;
	}

	public void setEhrUserName(String ehrUserName) {
		this.ehrUserName = ehrUserName;
	}
}
