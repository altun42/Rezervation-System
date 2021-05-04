package com.kerimaltun.interfaces;

import java.util.ArrayList;

import com.kerimaltun.models.Rezervasyon;


public interface IRezervasyonService {
	
	boolean Kaydet(Rezervasyon entity);
	boolean Sil(int id);
	boolean Guncelle(Rezervasyon entity);
	ArrayList<Rezervasyon> Listele();
	ArrayList<Rezervasyon> Listele(Rezervasyon entity);
	Rezervasyon Getir(int id);
	

}
