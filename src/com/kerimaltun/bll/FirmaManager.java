package com.kerimaltun.bll;

import java.util.ArrayList;

import com.kerimaltun.dalabstract.IFirmaRepository;
import com.kerimaltun.interfaces.IFirmaService;
import com.kerimaltun.models.Firma;
import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.pocomodels.PocoRezervasyon;


public class FirmaManager implements IFirmaService {
	
	//FirmaRepositoryMysql mysql = new FirmaRepositoryMysql();
    //FirmaRepositoryOracle oracle = new FirmaRepositoryOracle();
	
	IFirmaRepository firmaRepository;
	
	
	
	public FirmaManager(IFirmaRepository firmaRepository) {
		super();
		this.firmaRepository = firmaRepository;
	}

	@Override
	public boolean Kaydet(Firma entity) {
		boolean sonuc = firmaRepository.FirmaKontrol(entity.getVergiNo());
		if(!sonuc)
			return firmaRepository.Kaydet(entity)>0;
		return false;
		
	}

	@Override
	public boolean Sil(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Guncelle(Firma entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Rezervasyon> Listele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Rezervasyon> Listele(Firma entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PocoRezervasyon> TumunuListele(Firma entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Firma Getir(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
