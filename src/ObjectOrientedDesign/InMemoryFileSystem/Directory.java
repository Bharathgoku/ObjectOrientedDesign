package ObjectOrientedDesign.InMemoryFileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

    private List<Entry> entryList;

    public Directory() {
        this.entryList = new ArrayList<>();
    }

    public void deleteEntry(Entry entry){

    }

    public Entry addEntry(Entry entry){
        //
        entryList.add(entry);
        return entry;
    }

}
