package com.algolia.search.models;

import java.io.Serializable;
import java.util.List;

public class BatchIndexingResponse implements IAlgoliaWaitableResponse, Serializable {

  public BatchIndexingResponse(List<BatchResponse> responses) {
    this.responses = responses;
  }

  public List<BatchResponse> getResponses() {
    return responses;
  }

  public BatchIndexingResponse setResponses(List<BatchResponse> responses) {
    this.responses = responses;
    return this;
  }

  private List<BatchResponse> responses;

  @Override
  public void waitTask() {
    for (BatchResponse response : responses) response.waitTask();
  }
}
