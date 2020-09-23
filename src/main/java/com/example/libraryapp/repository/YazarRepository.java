package com.example.libraryapp.repository;

import com.example.libraryapp.entities.Yazar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YazarRepository extends JpaRepository<Yazar, Long> {
}
