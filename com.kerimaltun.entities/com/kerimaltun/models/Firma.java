package com.kerimaltun.models;

import java.sql.Date;

public class Firma {
	
	private int FirmaId;
	private int SubeId;
	private String FirmaUnvani;
	private String FirmaAdi;
	private String VergiDairesi;
	private long VergiNo;
	private String Adres;
	private int IlId;
	private int IlceId;
	private Date KayitZamani;
	private int KullaniciId;
	private String MacAdresi;
	private boolean Aktif;
	
	public Firma() {
		
	}
	
	public Firma(int firmaId, int subeId, String firmaUnvani, String firmaAdi, String vergiDairesi, long vergiNo,
			String adres, int ilId, int ilceId, Date kayitZamani, int kullaniciId, String macAdresi, boolean aktif) {
		super();
		FirmaId = firmaId;
		SubeId = subeId;
		FirmaUnvani = firmaUnvani;
		FirmaAdi = firmaAdi;
		VergiDairesi = vergiDairesi;
		VergiNo = vergiNo;
		Adres = adres;
		IlId = ilId;
		IlceId = ilceId;
		KayitZamani = kayitZamani;
		KullaniciId = kullaniciId;
		MacAdresi = macAdresi;
		Aktif = aktif;
	}

	public int getFirmaId() {
		return FirmaId;
	}
	public void setFirmaId(int firmaId) {
		FirmaId = firmaId;
	}
	public int getSubeId() {
		return SubeId;
	}
	public void setSubeId(int subeId) {
		SubeId = subeId;
	}
	public String getFirmaUnvani() {
		return FirmaUnvani;
	}
	public void setFirmaUnvani(String firmaUnvani) {
		FirmaUnvani = firmaUnvani;
	}
	public String getFirmaAdi() {
		return FirmaAdi;
	}
	public void setFirmaAdi(String firmaAdi) {
		FirmaAdi = firmaAdi;
	}
	public String getVergiDairesi() {
		return VergiDairesi;
	}
	public void setVergiDairesi(String vergiDairesi) {
		VergiDairesi = vergiDairesi;
	}
	public long getVergiNo() {
		return VergiNo;
	}
	public void setVergiNo(long vergiNo) {
		VergiNo = vergiNo;
	}
	public String getAdres() {
		return Adres;
	}
	public void setAdres(String adres) {
		Adres = adres;
	}
	public int getIlId() {
		return IlId;
	}
	public void setIlId(int ilId) {
		IlId = ilId;
	}
	public int getIlceId() {
		return IlceId;
	}
	public void setIlceId(int ilceId) {
		IlceId = ilceId;
	}
	public Date getKayitZamani() {
		return KayitZamani;
	}
	public void setKayitZamani(Date kayitZamani) {
		KayitZamani = kayitZamani;
	}
	public int getKullaniciId() {
		return KullaniciId;
	}
	public void setKullaniciId(int kullaniciId) {
		KullaniciId = kullaniciId;
	}
	public String getMacAdresi() {
		return MacAdresi;
	}
	public void setMacAdresi(String macAdresi) {
		MacAdresi = macAdresi;
	}
	public boolean isAktif() {
		return Aktif;
	}
	public void setAktif(boolean aktif) {
		Aktif = aktif;
	}

}
