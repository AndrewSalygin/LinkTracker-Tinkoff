package edu.java.bot.util;

import java.util.Map;

public final class ReplacerValiables {

    private ReplacerValiables() {}

    private static final String VARIABLE_BOUNDARY = "%";

    public static String replaceVariables(String message, Map<String, String> keyWords) {
        String copyMessage = message;
        for (Map.Entry<String, String> entry : keyWords.entrySet()) {
            String variable = VARIABLE_BOUNDARY + entry.getKey() + VARIABLE_BOUNDARY;
            String value = entry.getValue() != null ? entry.getValue() : "";
            copyMessage = copyMessage.replace(variable, value);
        }
        return copyMessage;
    }
}
