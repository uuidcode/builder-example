package com.github.uuidcode.builder.example;

import static com.github.uuidcode.builder.html.HtmlBuilder.body;
import static com.github.uuidcode.builder.html.HtmlBuilder.head;
import static com.github.uuidcode.builder.html.HtmlBuilder.html;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HtmlBuilderTest {
    protected static Logger logger = LoggerFactory.getLogger(HtmlBuilderTest.class);

    @Test
    public void test() {
        String html = html(
            head(),
            body()
        ).html();

        if (logger.isDebugEnabled()) {
            logger.debug(">>> test html\n {}", html);
        }
    }
}
