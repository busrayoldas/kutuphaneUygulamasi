package com.example.libraryapp.services;

import com.example.libraryapp.entities.Kitap;
import com.example.libraryapp.entities.YayinEvi;
import com.example.libraryapp.entities.Yazar;

import java.util.List;

public interface AraService {
    public List<Kitap> kitaplariGetir();

    public List<Yazar> yazarlariGetir();

    public List<YayinEvi> yayinEvleriGetir();
}
