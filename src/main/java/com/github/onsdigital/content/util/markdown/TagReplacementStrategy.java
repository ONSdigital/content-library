package com.github.onsdigital.content.util.markdown;

import com.github.onsdigital.content.service.ContentService;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Used for applying custom functions when replacing custom markdown tags.
 */
public abstract class TagReplacementStrategy {

    public String replaceAll(String input, ContentService contentService) throws IOException {

        Matcher matcher = this.getPattern().matcher(input);

        StringBuffer result = new StringBuffer(input.length());
        while (matcher.find()) {
            matcher.appendReplacement(result, this.replace(matcher, contentService));
        }

        matcher.appendTail(result);

        return result.toString();
    }

    /**
     * Gets the pattern that this strategy is applied to.
     * @return
     */
    abstract Pattern getPattern();

    /**
     * The function that generates the replacement text for each match.
     * @param matcher
     * @return
     */
    protected abstract String replace(Matcher matcher, ContentService contentService);

}
