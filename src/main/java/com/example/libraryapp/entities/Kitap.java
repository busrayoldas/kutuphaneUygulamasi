package com.example.libraryapp.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "KITAP")
public class Kitap {

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="kitap_id_seq")
    @SequenceGenerator(name="kitap_id_seq", sequenceName = "KITAP_ID_SEQ", allocationSize = 1)
    @Id
    @Column(name = "KITAP_ID", nullable = false)
    private Long kitapId;

    @Column(name = "KITAP_ADI")
    private String kitapAdi;

    @Column(name ="KITAP_ALT_ADI")
    private String kitapAltAdi;

    @Column(name = "KITAP_SERI_ADI")
    private String kitapSeriAdi;

    @Column(name ="YAZAR")
    private String yazar;

    @Column(name = "YAYIN_EVI")
    private String yayinEvi;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "ACIKLAMA")
    private String aciklama;
}
