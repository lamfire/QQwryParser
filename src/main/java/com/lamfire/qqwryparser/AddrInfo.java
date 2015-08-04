package com.lamfire.qqwryparser;


import java.net.InetAddress;

public class AddrInfo {
	private InetAddress address;
	private String providerName;
    private String country;
    private String  province;
    private String city;

	public AddrInfo() {

	}


	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

    public InetAddress getAddress() {
        return address;
    }

    public void setAddress(InetAddress address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
		return address +"(" +getCountry()+","+getProvince()+","+getCity() +")/" + providerName;
	}
}
