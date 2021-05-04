package com.kerimaltun.interfaces;

import java.util.ArrayList;

import com.kerimaltun.models.Firma;
import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.pocomodels.PocoRezervasyon;

public interface IFirmaService {
	
	boolean Kaydet(Firma entity);
	boolean Sil(int id);
	boolean Guncelle(Firma entity);
	ArrayList<Rezervasyon> Listele();
	ArrayList<Rezervasyon> Listele(Firma entity);
	ArrayList<PocoRezervasyon> TumunuListele(Firma entity);
	Firma Getir(int id);


}
