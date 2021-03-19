package com.competence.map.view;

import java.text.MessageFormat;

public enum ECompetenceArea {

  PLAN("A", "PLAN"),
  BUILD("B", "BUILD"),
  RUN("C", "RUN"),
  ENABLE("D", "ENABLE"),
  MANAGE("E", "MANAGE");

  private final String key;
  private final String value;

  ECompetenceArea(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public static String format(String value) {
    switch (value) {
      case "A":
        return MessageFormat.format("{0}: {1}", PLAN.getKey(), PLAN.getValue());
      case "B":
        return MessageFormat.format("{0}: {1}", BUILD.getKey(), BUILD.getValue());
      case "C":
        return MessageFormat.format("{0}: {1}", RUN.getKey(), RUN.getValue());
      case "D":
        return MessageFormat.format("{0}: {1}", ENABLE.getKey(), ENABLE.getValue());
      case "E":
        return MessageFormat.format("{0}: {1}", MANAGE.getKey(), MANAGE.getValue());
      default:
        return null;
    }
  }

  public String getKey() {
    return key;
  }

  public String getValue() {
    return value;
  }
}
