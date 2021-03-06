package com.algolia.search.util;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureUtils {
  public static <T> CompletableFuture<T> failedFuture(Throwable t) {
    final CompletableFuture<T> cf = new CompletableFuture<>();
    cf.completeExceptionally(t);
    return cf;
  }
}
