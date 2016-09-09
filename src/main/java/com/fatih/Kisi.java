package com.fatih;




public class Kisi {
	
	private String ad;
	private String soyad;
	
	
	private Adres adres;
	
	
	private Meslek meslek;
	/**
	 * @return the ad
	 */
	
	public Kisi() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Kisi(Adres adres, Meslek meslek) {
		super();
		this.adres = adres;
		this.meslek = meslek;
	}



	
	public Kisi(String ad, String soyad, Adres adres, Meslek meslek) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.meslek = meslek;
	}
	
	public void kisiEkle(String ad, String soyad, Adres adres, Meslek meslek) {
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.meslek = meslek;

	}
	
	
	public String getAd() {
		return ad;
	}
	
	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	/**
	 * @return the soyad
	 */
	public String getSoyad() {
		return soyad;
	}
	/**
	 * @param soyad the soyad to set
	 */
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	/**
	 * @return the adres
	 */
	public Adres getAdres() {
		return adres;
	}
	/**
	 * @param adres the adres to set
	 */
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	/**
	 * @return the meslek
	 */
	public Meslek getMeslek() {
		return meslek;
	}
	/**
	 * @param meslek the meslek to set
	 */
	public void setMeslek(Meslek meslek) {
		this.meslek = meslek;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", meslek=" + meslek + "]";
	}
	
	
	 	

}
