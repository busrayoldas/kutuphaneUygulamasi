package com.example.libraryapp;

import com.example.libraryapp.entities.Yazar;
import com.example.libraryapp.services.EkleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LibraryappApplication.class)
class LibraryappApplicationTests {

	@Autowired
	EkleService ekleService;

	@Test
	void contextLoads() {
		Yazar yazar = new Yazar();
		yazar.setYazarAdi("Büşra");
		yazar.setAciklama("Deneme");
		ekleService.yazarEkle(yazar);
	}
}