package com.example.BalkanciogluMarket;

public class Urun {
	private String urunAd;
	private String urunNo;

	public Urun(String urunAd, String urunNo) {
		this.urunAd = urunAd;
		this.urunNo = urunNo;
	}

	public String getUrunAd() {
		return urunAd;
	}

	public void setUrunAd(String urunAd) {
		this.urunAd = urunAd;
	}

	public String getUrunNo() {
		return urunNo;
	}

	public void setUrunNo(String urunNo) {
		this.urunNo = urunNo;
	}

}
