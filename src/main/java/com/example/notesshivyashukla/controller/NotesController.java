package com.example.notesshivyashukla.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.notesshivyashukla.model.Notes;
import com.example.notesshivyashukla.service.NoteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/notes")
@RequiredArgsConstructor
public class NotesController {
    private final NoteService noteService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Notes> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Notes> getNoteByID(@PathVariable(name = "id") Long id){
        return noteService.getNoteByID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNote(@RequestBody Notes note){
        noteService.saveNote(note);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNoteByID(@PathVariable(name = "id") Long id){
        noteService.deleteNoteByID(id);
    }

}
