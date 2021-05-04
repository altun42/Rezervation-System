package com.kerimaltun.models;

public class RezervasyonMisafir {
	private int RezervasyonMisafirId;
	private int RezervasyonId;
	private String MisafirAdi;
	private String SoyAdi;
	private String TcKimlikNo;
	private String PasaportNo;
	private String TelefonNo;
	
	public RezervasyonMisafir() {
		// TODO Auto-generated constructor stub
	}

	public RezervasyonMisafir(int rezervasyonMisafirId, int rezervasyonId, String misafirAdi, String soyAdi,
			String tcKimlikNo, String pasaportNo, String telefonNo) {
		super();
		RezervasyonMisafirId = rezervasyonMisafirId;
		RezervasyonId = rezervasyonId;
		MisafirAdi = misafirAdi;
		SoyAdi = soyAdi;
		TcKimlikNo = tcKimlikNo;
		PasaportNo = pasaportNo;
		TelefonNo = telefonNo;
	}

	public int getRezervasyonMisafirId() {
		return RezervasyonMisafirId;
	}

	public void setRezervasyonMisafirId(int rezervasyonMisafirId) {
		RezervasyonMisafirId = rezervasyonMisafirId;
	}

	public int getRezervasyonId() {
		return RezervasyonId;
	}

	public void setRezervasyonId(int rezervasyonId) {
		RezervasyonId = rezervasyonId;
	}

	public String getMisafirAdi() {
		return MisafirAdi;
	}

	public void setMisafirAdi(String misafirAdi) {
		MisafirAdi = misafirAdi;
	}

	public String getSoyAdi() {
		return SoyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		SoyAdi = soyAdi;
	}

	public String getTcKimlikNo() {
		return TcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		TcKimlikNo = tcKimlikNo;
	}

	public String getPasaportNo() {
		return PasaportNo;
	}

	public void setPasaportNo(String pasaportNo) {
		PasaportNo = pasaportNo;
	}

	public String getTelefonNo() {
		return TelefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		TelefonNo = telefonNo;
	}
	

}
