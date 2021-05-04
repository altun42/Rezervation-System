package com.kerimaltun.interfaces;

import java.util.ArrayList;


import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.pocomodels.PocoRezervasyon;

public interface IGenericService<T> {
	

	boolean Kaydet(T entity);
	boolean Sil(int id);
	boolean Guncelle(T entity);
	ArrayList<Rezervasyon> Listele();
	ArrayList<Rezervasyon> Listele(T entity);
	ArrayList<PocoRezervasyon> TumunuListele(T entity);
	T Getir(int id);

}
