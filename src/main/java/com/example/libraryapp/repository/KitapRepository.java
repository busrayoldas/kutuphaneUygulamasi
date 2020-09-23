package com.example.libraryapp.repository;

import com.example.libraryapp.entities.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository<Kitap, Long> {
}
