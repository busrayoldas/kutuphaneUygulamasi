package com.example.libraryapp.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "YAZAR")
public class Yazar {

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="yazar_id_seq")
    @SequenceGenerator(name="yazar_id_seq", sequenceName = "YAZAR_ID_SEQ", allocationSize = 1)
    @Id
    @Column(name = "YAZAR_ID", nullable = false)
    private Long yazarId;

    @Column(name = "YAZAR_ADI")
    private String yazarAdi;

    @Column(name = "ACIKLAMA")
    private String aciklama;

    public Long getYazarId() {
        return yazarId;
    }

    public void setYazarId(Long yazarId) {
        this.yazarId = yazarId;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
