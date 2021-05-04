package com.kerimaltun.pocomodels;

import com.kerimaltun.models.Rezervasyon;

public class PocoRezervasyon extends Rezervasyon {
	
	private String HizmetTuru;
	private String AracTipi;
	
	
	public String getHizmetTuru() {
		return HizmetTuru;
	}
	public void setHizmetTuru(String hizmetTuru) {
		HizmetTuru = hizmetTuru;
	}
	public String getAracTipi() {
		return AracTipi;
	}
	public void setAracTipi(String aracTipi) {
		AracTipi = aracTipi;
	}

}
