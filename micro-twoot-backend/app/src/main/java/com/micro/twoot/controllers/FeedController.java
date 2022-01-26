package com.micro.twoot.controllers;

import com.micro.twoot.models.Feed;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feeds")
public class FeedController {
    private List<Feed> feeds = new ArrayList<>();
    private Long newId = 0L;

    @GetMapping
    public List<Feed> list() {
        return feeds;
    }

    @PostMapping
    public Feed create(@RequestBody Feed feed) {
        feed.setId(generateId());
        feeds.add(feed);

        return null;
    }

    @PutMapping({"id"})
    public Feed update() {
        return null;

    }

    @DeleteMapping("id")
    public Feed delete() {

        return null;

    }



    private Long generateId() {
        newId += 1;
        return newId;
    }

}
