package com.khylo.anagramizer.controller;

import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

@RestController
@Data
@Log
public class AnagramController {

    Collection<String> realWordSet;
    List<String> orderedWords;

    @PostConstruct
    protected void init(){
        loadRealWords();
    }

    private void loadRealWords() throws IOException {
        String dir =  System.getProperty("user.dir");
        Path path = Paths.get(dir+"/filteredWordFreq.csv");
        realWordSet = new HashSet<>();
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(line -> {
                String[] args = line.split(",");
                realWordSet.add(args[1]);
            });
        }
        log.info(realWordSet.size()+" real words loaded");
    }

    public List<String> getAnagrams(String input){
        return null;
    }

}
