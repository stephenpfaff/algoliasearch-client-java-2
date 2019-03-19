package com.algolia.search.models;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AlgoliaHttpRequest {

  public AlgoliaHttpRequest(
      HttpMethod method, String methodPath, Map<String, String> headers, int timeout) {
    this.method = method;
    this.methodPath = methodPath;
    this.headers = headers;
    this.timeout = timeout;
  }

  public HttpMethod getMethod() {
    return method;
  }

  public AlgoliaHttpRequest setMethod(HttpMethod method) {
    this.method = method;
    return this;
  }

  public URL getUri() {
    return uri;
  }

  public AlgoliaHttpRequest setUri(URL uri) {
    this.uri = uri;
    return this;
  }

  public String getMethodPath() {
    return methodPath;
  }

  public AlgoliaHttpRequest setMethodPath(String methodPath) {
    this.methodPath = methodPath;
    return this;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public AlgoliaHttpRequest setHeaders(HashMap<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public ByteArrayInputStream getBody() {
    return body;
  }

  public AlgoliaHttpRequest setBody(ByteArrayInputStream body) {
    this.body = body;
    return this;
  }

  public int getTimeout() {
    return timeout;
  }

  public AlgoliaHttpRequest setTimeout(int timeout) {
    this.timeout = timeout;
    return this;
  }

  private HttpMethod method;
  private URL uri;
  private String methodPath;
  private Map<String, String> headers;
  private ByteArrayInputStream body;
  private int timeout;
}