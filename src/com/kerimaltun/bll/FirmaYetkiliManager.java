package com.kerimaltun.bll;

import java.util.ArrayList;

import com.kerimaltun.interfaces.IGenericService;
import com.kerimaltun.models.FirmaYetkili;
import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.pocomodels.PocoRezervasyon;

public class FirmaYetkiliManager implements IGenericService<FirmaYetkili> {

	@Override
	public boolean Kaydet(FirmaYetkili entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Guncelle(FirmaYetkili entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Rezervasyon> Listele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Rezervasyon> Listele(FirmaYetkili entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PocoRezervasyon> TumunuListele(FirmaYetkili entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FirmaYetkili Getir(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
