package com.example.notesshivyashukla.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.notesshivyashukla.model.Notes;
import com.example.notesshivyashukla.repo.NotesRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NotesRepo notesRepo;

    public List<Notes> getAllNotes(){
        return notesRepo.findAll();
    }

    public Optional<Notes> getNoteByID(Long ID){
        return notesRepo.findById(ID);
    }

    public void saveNote(Notes note){
        notesRepo.save(note);
    }

    public void deleteNoteByID(Long ID){
        notesRepo.deleteById(ID);
    }
}
