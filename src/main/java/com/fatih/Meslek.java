package com.fatih;

import org.springframework.stereotype.Component;


public class Meslek {
	
	private String meslekAdi;
	private String sektor;
	private int maas;
	
	
	public Meslek() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	public Meslek(String meslekAdi, String sektor, int maas) {
		super();
		this.meslekAdi = meslekAdi;
		this.sektor = sektor;
		this.maas = maas;
	}
	
	
	public void meslekEkle(String meslekAdi, String sektor, int maas){
		this.meslekAdi = meslekAdi;
		this.sektor = sektor;
		this.maas = maas;
	}
	
	
	/**
	 * @return the meslekAdi
	 */
	public String getMeslekAdi() {
		return meslekAdi;
	}
	/**
	 * @param meslekAdi the meslekAdi to set
	 */
	public void setMeslekAdi(String meslekAdi) {
		this.meslekAdi = meslekAdi;
	}
	/**
	 * @return the sektor
	 */
	public String getSektor() {
		return sektor;
	}
	/**
	 * @param sektor the sektor to set
	 */
	public void setSektor(String sektor) {
		this.sektor = sektor;
	}
	/**
	 * @return the maas
	 */
	public int getMaas() {
		return maas;
	}
	/**
	 * @param maas the maas to set
	 */
	public void setMaas(int maas) {
		this.maas = maas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Meslek [meslekAdi=" + meslekAdi + ", sektor=" + sektor + ", maas=" + maas + "]";
	}
	
	

}
