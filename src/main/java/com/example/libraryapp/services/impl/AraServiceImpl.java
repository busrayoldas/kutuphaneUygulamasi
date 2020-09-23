package com.example.libraryapp.services.impl;

import com.example.libraryapp.entities.Kitap;
import com.example.libraryapp.entities.YayinEvi;
import com.example.libraryapp.entities.Yazar;
import com.example.libraryapp.repository.KitapRepository;
import com.example.libraryapp.repository.YayinEviRepository;
import com.example.libraryapp.repository.YazarRepository;
import com.example.libraryapp.services.AraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AraServiceImpl implements AraService {
    @Autowired
    private KitapRepository kitapRepository;
    @Autowired
    private YayinEviRepository yayinEviRepository;
    @Autowired
    private YazarRepository yazarRepository;

    public List<Kitap> kitaplariGetir() {
        List<Kitap> kitaplar = kitapRepository.findAll();
        return kitaplar;
    }

    public List<Yazar> yazarlariGetir() {
        List<Yazar> yazarlar = yazarRepository.findAll();
        return yazarlar;
    }

    public List<YayinEvi> yayinEvleriGetir() {
        List<YayinEvi> yayinEvleri = yayinEviRepository.findAll();
        return yayinEvleri;
    }

}
