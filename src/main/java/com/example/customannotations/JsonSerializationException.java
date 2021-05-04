package com.example.customannotations;

public class JsonSerializationException extends RuntimeException {

  public JsonSerializationException(String errorMessage) {
    super(errorMessage);
  }
}
