package com.fatih;




public class Adres {
	
	private String mahalle;
	private String sokak;
	private int no;
	private String ilce;
	private String il;
	/**
	 * @return the mahalle
	 */
	
	 public Adres() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Adres(String mahalle, String sokak, int no, String ilce, String il) {
		super();
		this.mahalle = mahalle;
		this.sokak = sokak;
		this.no = no;
		this.ilce = ilce;
		this.il = il;
	}
	
	public void adreEkle(String mahalle, String sokak, int no, String ilce, String il){
		this.mahalle = mahalle;
		this.sokak = sokak;
		this.no = no;
		this.ilce = ilce;
		this.il = il;
		
		
	}
	
	
	/**
	 * @param mahalle the mahalle to set
	 */
	

	public String getMahalle() {
		return mahalle;
	}
	
	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
	/**
	 * @return the sokak
	 */
	public String getSokak() {
		return sokak;
	}
	/**
	 * @param sokak the sokak to set
	 */
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the ilce
	 */
	public String getIlce() {
		return ilce;
	}
	/**
	 * @param ilce the ilce to set
	 */
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	/**
	 * @return the il
	 */
	public String getIl() {
		return il;
	}
	/**
	 * @param il the il to set
	 */
	public void setIl(String il) {
		this.il = il;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adres [mahalle=" + mahalle + ", sokak=" + sokak + ", no=" + no + ", ilce=" + ilce + ", il=" + il + "]";
	}
	
	

	

}
