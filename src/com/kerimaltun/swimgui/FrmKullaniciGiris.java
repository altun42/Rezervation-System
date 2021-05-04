package com.kerimaltun.swimgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.kerimaltun.bll.FirmaManager;
import com.kerimaltun.dalconcrete.FirmaRepositoryMysql;
import com.kerimaltun.dalconcrete.FirmaRepositoryOracle;
import com.kerimaltun.interfaces.IFirmaService;
import com.kerimaltun.models.Firma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmKullaniciGiris extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmKullaniciGiris frame = new FrmKullaniciGiris();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmKullaniciGiris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Firma f = new Firma();
				f.setFirmaAdi("ABC Anonim");
				f.setFirmaUnvani("ABC aNONÝM");
				f.setVergiNo(1234);
				
				//FirmaManager firma = new FirmaManager();
				//firma.Kaydet(f);
				IFirmaService firmaService = new FirmaManager(new FirmaRepositoryMysql());
				firmaService.Kaydet(f);
				
				IFirmaService firmaService1 = new FirmaManager(new FirmaRepositoryOracle());
				firmaService1.Kaydet(f);
			}
		});
		btnNewButton.setBounds(124, 138, 85, 21);
		contentPane.add(btnNewButton);
	}
}
