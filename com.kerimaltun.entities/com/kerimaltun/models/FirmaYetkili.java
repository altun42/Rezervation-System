package com.kerimaltun.models;

import java.sql.Date;

public class FirmaYetkili {
	private int FirmaYetkiliId;
	private int FirmaId;
	private String YetkiliAdi;
	private String YetkiliSoyadi;
	private String Gorevi;
	private String CepTelNo;
	private String EMail;
	private int Kullan�c�Id;
	private Date KayitZamani;
	private String MacAdresi;
	private boolean Aktif;
	public FirmaYetkili() {
		
	}
	public FirmaYetkili(int firmaYetkiliId, int firmaId, String yetkiliAdi, String yetkiliSoyadi, String gorevi,
			String cepTelNo, String eMail, int kullan�c�Id, Date kayitZamani, String macAdresi, boolean aktif) {
		super();
		FirmaYetkiliId = firmaYetkiliId;
		FirmaId = firmaId;
		YetkiliAdi = yetkiliAdi;
		YetkiliSoyadi = yetkiliSoyadi;
		Gorevi = gorevi;
		CepTelNo = cepTelNo;
		EMail = eMail;
		Kullan�c�Id = kullan�c�Id;
		KayitZamani = kayitZamani;
		MacAdresi = macAdresi;
		Aktif = aktif;
	}
	public int getFirmaYetkiliId() {
		return FirmaYetkiliId;
	}
	public void setFirmaYetkiliId(int firmaYetkiliId) {
		FirmaYetkiliId = firmaYetkiliId;
	}
	public int getFirmaId() {
		return FirmaId;
	}
	public void setFirmaId(int firmaId) {
		FirmaId = firmaId;
	}
	public String getYetkiliAdi() {
		return YetkiliAdi;
	}
	public void setYetkiliAdi(String yetkiliAdi) {
		YetkiliAdi = yetkiliAdi;
	}
	public String getYetkiliSoyadi() {
		return YetkiliSoyadi;
	}
	public void setYetkiliSoyadi(String yetkiliSoyadi) {
		YetkiliSoyadi = yetkiliSoyadi;
	}
	public String getGorevi() {
		return Gorevi;
	}
	public void setGorevi(String gorevi) {
		Gorevi = gorevi;
	}
	public String getCepTelNo() {
		return CepTelNo;
	}
	public void setCepTelNo(String cepTelNo) {
		CepTelNo = cepTelNo;
	}
	public String getEMail() {
		return EMail;
	}
	public void setEMail(String eMail) {
		EMail = eMail;
	}
	public int getKullan�c�Id() {
		return Kullan�c�Id;
	}
	public void setKullan�c�Id(int kullan�c�Id) {
		Kullan�c�Id = kullan�c�Id;
	}
	public Date getKayitZamani() {
		return KayitZamani;
	}
	public void setKayitZamani(Date kayitZamani) {
		KayitZamani = kayitZamani;
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
