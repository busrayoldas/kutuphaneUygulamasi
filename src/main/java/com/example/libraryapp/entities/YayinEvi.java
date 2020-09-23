package com.example.libraryapp.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "YAYIN_EVI")
public class YayinEvi {

    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="yayin_evi_id_seq")
    @SequenceGenerator(name="yayin_evi_id_seq", sequenceName = "YAYIN_EVI_ID_SEQ", allocationSize = 1)
    @Id
    @Column(name = "YAYIN_EVI_ID", nullable = false)
    private Long yayinEviId;

    @Column(name = "YAYIN_EVI_ADI")
    private String yayinEviAdi;

    @Column(name = "ACIKLAMA")
    private String aciklama;

}
