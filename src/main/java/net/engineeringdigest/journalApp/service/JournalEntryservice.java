package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryservice {

    @Autowired
    private JournalEntryRepository journalEntryRepository;
    public void saveEntry(JournalEntry entry) {
        journalEntryRepository.save(entry);
    }
    public List<JournalEntry> getAll() {
        return journalEntryRepository.findAll();
    }
    public JournalEntry findById(ObjectId id) {
        return journalEntryRepository.findById(id.toString()).orElse(null);
    }
    public void deleteById(ObjectId id) {
        journalEntryRepository.deleteById(id.toString());
    }
    public JournalEntry updateEntry(ObjectId id, JournalEntry updatedEntry) {
        if (journalEntryRepository.existsById(id.toString())) {
            updatedEntry.setId(id);
            return journalEntryRepository.save(updatedEntry);
        }
        return null;
    }
}
