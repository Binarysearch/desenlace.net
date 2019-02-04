package net.desenlace;

import java.util.List;

public class Project {

    private String name;
    private String description;
    private String link;
    private String[] tecnologies;


    public Project(String name, String description, String link, String[] tecnologies){
        this.name = name;
        this.description = description;
        this.link = link;
        this.tecnologies = tecnologies;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the tecnologies
     */
    public String[] getTecnologies() {
        return tecnologies;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}