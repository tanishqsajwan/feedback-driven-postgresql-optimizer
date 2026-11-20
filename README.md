# Feedback-Driven PostgreSQL Optimizer

A Java-focused system that learns from PostgreSQL query execution results to identify inefficient query plans, evaluate optimization alternatives, and improve future optimization recommendations through execution feedback.

## Problem

PostgreSQL's query optimizer can sometimes make poor decisions because its estimates do not match what actually happens during query execution.

For example:

* Estimated rows: 10,000
* Actual rows: 800,000

A large estimation error can cause PostgreSQL to choose an inefficient execution plan.

Developers usually have to manually investigate these problems and determine whether another approach would perform better.

## What This Project Does

The system creates a feedback loop around PostgreSQL:

```text
SQL Query
    ↓
PostgreSQL Execution Plan
    ↓
Estimated vs Actual Behavior
    ↓
Detect Optimization Opportunities
    ↓
Generate / Identify Alternatives
    ↓
Run Controlled Experiments
    ↓
Measure Actual Performance
    ↓
Store Results
    ↓
Learn From Feedback
    ↓
Improve Future Recommendations
```

## Core Features

* PostgreSQL execution-plan analysis
* Estimated vs actual row comparison
* Cardinality-error detection
* Query performance measurement
* Optimization opportunity detection
* Alternative optimization strategies
* Controlled performance experiments
* Before/after benchmarking
* Historical execution feedback
* ML-based optimization ranking
* Confidence scores for recommendations
* Explanation of optimization decisions
* Performance history and dashboard

## Technology Stack

### Backend

* Java
* Spring Boot
* REST APIs

### Database

* PostgreSQL
* SQL
* PostgreSQL EXPLAIN / EXPLAIN ANALYZE

### Machine Learning

* Python
* Machine Learning
* FastAPI

### Frontend

* React

### Infrastructure

* Docker
* Git
* GitHub

## Development Approach

The project will be developed incrementally:

**Learn → Build → Test → Benchmark → Commit → Push**

Each major feature must work before moving to the next stage.

## Project Goal

The long-term goal is not to replace PostgreSQL's optimizer.

Instead, the system aims to learn from actual execution feedback and help identify situations where PostgreSQL's chosen plan may be suboptimal, then evaluate alternatives and use the results to improve future recommendations.

## Status

Project development has started.
