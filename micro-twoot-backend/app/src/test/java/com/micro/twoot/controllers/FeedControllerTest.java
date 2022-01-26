// TODO
// 1. GET /feeds
// 2. GET /feed/{id}
// 3. POST /feeds
// 4. PUT/PATCH /feeds/{id}
// 5. DELETE /feeds/{id}
package com.micro.twoot.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import com.micro.twoot.models.Feed;
import org.junit.jupiter.api.Test;

class FeedControllerTest {

    @Test
    void getList() {
        FeedController feedController = new FeedController();

        assertThat(feedController.list()).isEmpty();

    }

    @Test
    void createFeed() {
        FeedController feedController = new FeedController();

        Feed feed = new Feed();

        feed.setContent("트윗!");
        feedController.create(feed);

        assertThat(feedController.list().get(0).getId()).isEqualTo(1L);
    }

    @Test
    void updateFeed() {
        FeedController feedController = new FeedController();

       assertThat(feedController.update()).isNull();
    }

    @Test
    void deleteFeed() {
        FeedController feedController = new FeedController();

        assertThat(feedController.delete()).isNull();
    }

}
