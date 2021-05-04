package com.kerimaltun.models;

import java.sql.Date;

public class Rezervasyon {
	private int RezervasyonId;
	private int HizmetTuruId;
	private int AracTipiId;
	private String KalkisNoktasi;
	private String VarisNoktasi;
	private Date CikisTarihi;
	private String CikisSaati;
	private Date DonusTarihi;
	private String DonusSaati;
	private String UcusNo;
	private byte MisafirYetiskinSayisi;
	private byte MisafirCocukSayisi;
	private byte MisafirBebekSayisi;
	private int SubeId;
	private int FirmaId;
	private int KullaniciId;
	private Date KayitZamani;
	
	public Rezervasyon() {
		
	}

	public Rezervasyon(int rezervasyonId, int hizmetTuruId, int aracTipiId, String kalkisNoktasi, String varisNoktasi,
			Date cikisTarihi, String cikisSaati, Date donusTarihi, String donusSaati, String ucusNo,
			byte misafirYetiskinSayisi, byte misafirCocukSayisi, byte misafirBebekSayisi, int subeId, int firmaId,
			int kullaniciId, Date kayitZamani) {
		super();
		RezervasyonId = rezervasyonId;
		HizmetTuruId = hizmetTuruId;
		AracTipiId = aracTipiId;
		KalkisNoktasi = kalkisNoktasi;
		VarisNoktasi = varisNoktasi;
		CikisTarihi = cikisTarihi;
		CikisSaati = cikisSaati;
		DonusTarihi = donusTarihi;
		DonusSaati = donusSaati;
		UcusNo = ucusNo;
		MisafirYetiskinSayisi = misafirYetiskinSayisi;
		MisafirCocukSayisi = misafirCocukSayisi;
		MisafirBebekSayisi = misafirBebekSayisi;
		SubeId = subeId;
		FirmaId = firmaId;
		KullaniciId = kullaniciId;
		KayitZamani = kayitZamani;
	}

	public int getRezervasyonId() {
		return RezervasyonId;
	}

	public void setRezervasyonId(int rezervasyonId) {
		RezervasyonId = rezervasyonId;
	}

	public int getHizmetTuruId() {
		return HizmetTuruId;
	}

	public void setHizmetTuruId(int hizmetTuruId) {
		HizmetTuruId = hizmetTuruId;
	}

	public int getAracTipiId() {
		return AracTipiId;
	}

	public void setAracTipiId(int aracTipiId) {
		AracTipiId = aracTipiId;
	}

	public String getKalkisNoktasi() {
		return KalkisNoktasi;
	}

	public void setKalkisNoktasi(String kalkisNoktasi) {
		KalkisNoktasi = kalkisNoktasi;
	}

	public String getVarisNoktasi() {
		return VarisNoktasi;
	}

	public void setVarisNoktasi(String varisNoktasi) {
		VarisNoktasi = varisNoktasi;
	}

	public Date getCikisTarihi() {
		return CikisTarihi;
	}

	public void setCikisTarihi(Date cikisTarihi) {
		CikisTarihi = cikisTarihi;
	}

	public String getCikisSaati() {
		return CikisSaati;
	}

	public void setCikisSaati(String cikisSaati) {
		CikisSaati = cikisSaati;
	}

	public Date getDonusTarihi() {
		return DonusTarihi;
	}

	public void setDonusTarihi(Date donusTarihi) {
		DonusTarihi = donusTarihi;
	}

	public String getDonusSaati() {
		return DonusSaati;
	}

	public void setDonusSaati(String donusSaati) {
		DonusSaati = donusSaati;
	}

	public String getUcusNo() {
		return UcusNo;
	}

	public void setUcusNo(String ucusNo) {
		UcusNo = ucusNo;
	}

	public byte getMisafirYetiskinSayisi() {
		return MisafirYetiskinSayisi;
	}

	public void setMisafirYetiskinSayisi(byte misafirYetiskinSayisi) {
		MisafirYetiskinSayisi = misafirYetiskinSayisi;
	}

	public byte getMisafirCocukSayisi() {
		return MisafirCocukSayisi;
	}

	public void setMisafirCocukSayisi(byte misafirCocukSayisi) {
		MisafirCocukSayisi = misafirCocukSayisi;
	}

	public byte getMisafirBebekSayisi() {
		return MisafirBebekSayisi;
	}

	public void setMisafirBebekSayisi(byte misafirBebekSayisi) {
		MisafirBebekSayisi = misafirBebekSayisi;
	}

	public int getSubeId() {
		return SubeId;
	}

	public void setSubeId(int subeId) {
		SubeId = subeId;
	}

	public int getFirmaId() {
		return FirmaId;
	}

	public void setFirmaId(int firmaId) {
		FirmaId = firmaId;
	}

	public int getKullaniciId() {
		return KullaniciId;
	}

	public void setKullaniciId(int kullaniciId) {
		KullaniciId = kullaniciId;
	}

	public Date getKayitZamani() {
		return KayitZamani;
	}

	public void setKayitZamani(Date kayitZamani) {
		KayitZamani = kayitZamani;
	}
	

}
