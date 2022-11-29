package com.example.notesshivyashukla.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notesshivyashukla.model.Notes;

public interface NotesRepo extends JpaRepository<Notes, Long> {
    
}
