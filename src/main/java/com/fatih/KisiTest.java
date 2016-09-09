package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KisiTest {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
		
		Kisi kisi=context.getBean(Kisi.class);
		Adres adres=context.getBean(Adres.class);
		Meslek meslek=context.getBean(Meslek.class);
		
		adres.adreEkle("sümbül", "yayla sokak", 145, "Konak", "İzmir");
		meslek.meslekEkle("Mühendis", "İnşaat", 3750);
		
		kisi.kisiEkle("tarık", "Yılmaz",adres, meslek);
		
		System.out.println(kisi);
		
		
	}

}
