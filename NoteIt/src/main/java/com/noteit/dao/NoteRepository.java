package com.noteit.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noteit.domain.Note;
import com.noteit.domain.Notebook;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID>{
	List<Note> findAllByNotebook(Notebook notebook);
}
