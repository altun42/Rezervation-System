package com.kerimaltun.bll;

import java.util.ArrayList;

import com.kerimaltun.interfaces.IRezervasyonMisafirService;
import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.models.RezervasyonMisafir;
import com.kerimaltun.pocomodels.PocoRezervasyon;

public class RezervasyonMisafirManager implements IRezervasyonMisafirService {

	@Override
	public boolean Kaydet(RezervasyonMisafir entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Guncelle(RezervasyonMisafir entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Rezervasyon> Listele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Rezervasyon> Listele(RezervasyonMisafir entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PocoRezervasyon> TumunuListele(RezervasyonMisafir entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RezervasyonMisafir Getir(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<RezervasyonMisafir> MisafirListele(RezervasyonMisafir entitiy) {
		// TODO Auto-generated method stub
		return null;
	}

}
