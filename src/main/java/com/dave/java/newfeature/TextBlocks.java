package com.dave.java.newfeature;

/**
 * 文本模块jdk15+
 */
public class TextBlocks {
    public static final String OLD =
            "Yesterday, upon the stair,\n" +
                    "I met a man who wasn't there\n" +
                    "He wasn't there again today\n" +
                    "I wish, I wish he'd go away...\n" +
                    "\n" +
                    "When I came home last night at three\n" +
                    "The man was waiting there for me\n" +
                    "But when I looked around the hall\n" +
                    "I couldn't see him there at all!\n";

    /**
     * """ XXX """
     * 去掉换行符和缩进
     */
    public static final String NEW = """
    Yesterday, upon the stair,
    I met a man who wasn't there
    He wasn't there again today
    I wish, I wish he'd go away...

    When I came home last night at three
    The man was waiting there for me
    But when I looked around the hall
    I couldn't see him there at all!
    """;

    public static void main(String[] args) {
        System.out.println(OLD.equals(NEW));
    }
}
