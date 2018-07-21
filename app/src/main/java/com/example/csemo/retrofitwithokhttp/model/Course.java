package com.example.csemo.retrofitwithokhttp.model;
import java.util.List;

public class Course   {

    private int localId;
    private String subtitle;
    private String title;
    private String key;
    private String image;
    private String banner_image;
    private String expected_learning;
    private String featured;
    private String project_description;
    private String level;
    private String expected_duration_unit;
    private String expected_duration;
    private String summary;
    private String project_name;
    private String required_knowledge;
    private String syllabus;
    private List<Instructor> instructors;


    public int getLocalId() {
        return localId;
    }

    public void setLocalId(int localId) {
        this.localId = localId;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getExpected_learning() {
        return expected_learning;
    }

    public void setExpected_learning(String expected_learning) {
        this.expected_learning = expected_learning;
    }

    public String getFeatured() {
        return featured;
    }

    public void setFeatured(String featured) {
        this.featured = featured;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBanner_image() {
        return banner_image;
    }

    public void setBanner_image(String banner_image) {
        this.banner_image = banner_image;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExpected_duration_unit() {
        return expected_duration_unit;
    }

    public void setExpected_duration_unit(String expected_duration_unit) {
        this.expected_duration_unit = expected_duration_unit;
    }

    public String getExpected_duration() {
        return expected_duration;
    }

    public void setExpected_duration(String expected_duration) {
        this.expected_duration = expected_duration;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getRequired_knowledge() {
        return required_knowledge;
    }

    public void setRequired_knowledge(String required_knowledge) {
        this.required_knowledge = required_knowledge;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }
}
