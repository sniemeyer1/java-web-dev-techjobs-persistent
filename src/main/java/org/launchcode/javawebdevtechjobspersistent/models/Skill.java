package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String longerDescription;

    public Skill() {
    }

    public String getLongerDescription() {
        return longerDescription;
    }

    public void setLongerDescription(String longerDescription) {
        this.longerDescription = longerDescription;
    }
}