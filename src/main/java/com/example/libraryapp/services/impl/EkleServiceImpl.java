package com.example.libraryapp.services.impl;

import com.example.libraryapp.entities.Kitap;
import com.example.libraryapp.entities.YayinEvi;
import com.example.libraryapp.entities.Yazar;
import com.example.libraryapp.repository.KitapRepository;
import com.example.libraryapp.repository.YayinEviRepository;
import com.example.libraryapp.repository.YazarRepository;
import com.example.libraryapp.services.EkleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EkleServiceImpl implements EkleService {
    @Autowired
    private KitapRepository kitapRepository;
    @Autowired
    private YayinEviRepository yayinEviRepository;
    @Autowired
    private YazarRepository yazarRepository;


    public Kitap kitapEkle(Kitap yeniKitap){
        yeniKitap = kitapRepository.save(yeniKitap);
        return yeniKitap;
    }

    public Yazar yazarEkle(Yazar yeniYazar){
        yeniYazar = yazarRepository.save(yeniYazar);
        return yeniYazar;
    }

    public YayinEvi yayinEviEkle(YayinEvi yeniYayinEvi){
        yeniYayinEvi = yayinEviRepository.save(yeniYayinEvi);
        return yeniYayinEvi;
    }

}
