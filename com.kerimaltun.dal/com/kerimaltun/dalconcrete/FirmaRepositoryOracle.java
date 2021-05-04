package com.kerimaltun.dalconcrete;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.kerimaltun.dalabstract.IFirmaRepository;
import com.kerimaltun.models.Firma;
import com.kerimaltun.models.Rezervasyon;
import com.kerimaltun.pocomodels.PocoRezervasyon;

public class FirmaRepositoryOracle implements IFirmaRepository{

	@Override
	public int Kaydet(Firma entity) {
		JOptionPane.showMessageDialog(null, "Oracleda veri firma kaydedildi.");
		return 0;
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

	@Override
	public boolean FirmaKontrol(long VergiNO) {
		// TODO Auto-generated method stub
		return false;
	}

}
