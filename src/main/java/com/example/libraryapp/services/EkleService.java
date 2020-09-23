package com.example.libraryapp.services;

import com.example.libraryapp.entities.Kitap;
import com.example.libraryapp.entities.YayinEvi;
import com.example.libraryapp.entities.Yazar;

public interface EkleService {
    public Kitap kitapEkle(Kitap kitap);

    public Yazar yazarEkle(Yazar yazar);

    public YayinEvi yayinEviEkle(YayinEvi yayinEvi);
}
