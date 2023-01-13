package com.example.streamApi.designPatterns.creation.builder;

import java.util.Date;

public class TaskBuilder {

    private int id;
    private String summary;
    private String description;
    private Date deadline;
    private Date creationDate;
    private Object assigned;

    public TaskBuilder(){}
    public TaskBuilder(int id,
                       String summary,
                       String description,
                       Date deadline,
                       Date creationDate,
                       Object assigned) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.deadline = deadline;
        this.creationDate = creationDate;
        this.assigned = assigned;
    }

    public TaskBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public TaskBuilder setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }

    public TaskBuilder setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public TaskBuilder setAssigned(Object assigned) {
        this.assigned = assigned;
        return this;
    }

    public TaskBuilder builder() {
        return new TaskBuilder(this.id, this.summary, this.description, this.deadline, this.creationDate, this.assigned);
    }

    @Override
    public String toString() {
        return "TaskBuilder{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", creationDate=" + creationDate +
                ", assigned=" + assigned +
                '}';
    }
}
