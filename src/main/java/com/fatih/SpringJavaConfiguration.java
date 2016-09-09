package com.fatih;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringJavaConfiguration {

	
	public SpringJavaConfiguration() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Bean
	public Kisi kisiBeanOlustur(){
		return new Kisi();
	}
	
	@Bean
	public Adres adresBeanOlustur(){
		return new Adres();
	}
	
	
	@Bean
	public Meslek meslekBeanOlustur(){
		return new Meslek();
	}
	
}
