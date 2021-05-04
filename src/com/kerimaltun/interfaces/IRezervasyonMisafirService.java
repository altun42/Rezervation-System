package com.kerimaltun.interfaces;

import java.util.ArrayList;

import com.kerimaltun.models.RezervasyonMisafir;

public interface IRezervasyonMisafirService extends IGenericService<RezervasyonMisafir> {
	ArrayList<RezervasyonMisafir> MisafirListele(RezervasyonMisafir entitiy);

}
