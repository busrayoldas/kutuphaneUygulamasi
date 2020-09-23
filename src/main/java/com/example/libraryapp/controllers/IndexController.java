package com.example.libraryapp.controllers;

import com.example.libraryapp.entities.Kitap;
import com.example.libraryapp.entities.YayinEvi;
import com.example.libraryapp.entities.Yazar;
import com.example.libraryapp.services.AraService;
import com.example.libraryapp.services.EkleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private AraService araService;
    @Autowired
    private EkleService ekleService;

    @RequestMapping("/kitapEkle")
    public String kitapEkle(Model model){
        model.addAttribute("kitap", new Kitap());
        return "kitapEkle";
    }

    @RequestMapping("/yazarEkle")
    public String yazarEkle(Model model){
        model.addAttribute("yazar", new Yazar());
        return "yazarEkle";
    }

    @RequestMapping("/yayinEviEkle")
    public String yayinEviEkle(Model model){
        model.addAttribute("yayinEvi", new YayinEvi());
        return "yayinEviEkle";
    }

    @RequestMapping(value = "/kitapKaydet", method = RequestMethod.POST)
    public String kitapKaydet(Kitap kitap){
        ekleService.kitapEkle(kitap);
        return "kitapEkle";
    }

    @RequestMapping(value = "/yazarKaydet", method = RequestMethod.POST)
    public String yazarKaydet(Yazar yazar){
        ekleService.yazarEkle(yazar);
        return "yazarEkle";
    }

    @RequestMapping(value = "/yayinEviKaydet", method = RequestMethod.POST)
    public String yayinEviKaydet(YayinEvi yayinEvi){
        ekleService.yayinEviEkle(yayinEvi);
        return "yayinEviEkle";
    }

    @RequestMapping(value = "/kitapIslemleri")
    public String kitapIslemleri(Model model){
        List<Kitap> kitaplar = araService.kitaplariGetir();
        model.addAttribute("kitaplar",kitaplar);
        return "kitapIslemleri";
    }

    @RequestMapping("/yazarIslemleri")
    public String yazarIslemleri(Model model){
        List<Yazar> yazarlar = araService.yazarlariGetir();
        model.addAttribute("yazarlar",yazarlar);
        return "yazarIslemleri";
    }

    @RequestMapping("/yayinEviIslemleri")
    public String yayinEviIslemleri(Model model){
        List<YayinEvi> yayinEvleri = araService.yayinEvleriGetir();
        model.addAttribute("yayinEvleri",yayinEvleri);
        return "yayinEviIslemleri";
    }

}
