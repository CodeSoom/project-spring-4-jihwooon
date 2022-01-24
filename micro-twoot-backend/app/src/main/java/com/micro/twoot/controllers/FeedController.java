//TODO
// 1. Read Collection = GET /feed
// 2. Read
// 3. Create
// 4. Update
// 5. Delete
package com.micro.twoot.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feed")
public class FeedController {

    @GetMapping
    public String list() {
        return "List";
    }

    @PostMapping
    public String create() {
        return "Post";
    }

    @PutMapping
    public String update() {
        return "Update";
    }

    @DeleteMapping
    public String delete() {
        return "Delete";
    }

}
