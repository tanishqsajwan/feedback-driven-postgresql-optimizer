package com.tanishq.queryanalyzer;

public record QueryFeedbackRequest(String query, long executionTimeMs) {
}