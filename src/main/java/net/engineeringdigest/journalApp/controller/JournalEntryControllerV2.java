package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryservice;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Journal")
public class JournalEntryControllerV2 {

    @Autowired
     private JournalEntryservice journalEntryservice;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryservice.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry entry){
        entry.setDate(LocalDateTime.now());
        journalEntryservice.saveEntry(entry);
        return entry;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getEntryById(@PathVariable ObjectId myId){
        return journalEntryservice.findById(myId);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable ObjectId myId){
        JournalEntry entryToDelete = journalEntryservice.findById(myId);
        if (entryToDelete != null) {
            journalEntryservice.deleteById(myId);
        return entryToDelete;
        }
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateEntryById(@PathVariable ObjectId myId, @RequestBody JournalEntry updatedEntry){
        updatedEntry.setDate(LocalDateTime.now());
        return journalEntryservice.updateEntry(myId, updatedEntry);
    }
}
