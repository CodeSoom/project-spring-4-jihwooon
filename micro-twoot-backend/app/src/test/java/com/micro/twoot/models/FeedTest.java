package com.micro.twoot.models;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class FeedTest {

    @Test
    void createFeed() {
        Feed feed = new Feed();
        feed.setId(1L);
        feed.setContent("트윗!");

        assertThat(feed.getId()).isEqualTo(1L);
        assertThat(feed.getId()).isNotEqualTo(2L);
        assertThat(feed.getContent()).isNotEqualTo("트우트!");
        assertThat(feed.getContent()).isEqualTo("트윗!");

    }

}

