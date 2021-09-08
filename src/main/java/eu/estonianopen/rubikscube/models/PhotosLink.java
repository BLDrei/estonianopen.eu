package eu.estonianopen.rubikscube.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PhotosLink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String link, eventName, additionalInfo;

    public PhotosLink() {
    }

    public PhotosLink(String link, String eventName, String additionalInfo) {
        this.link = link;
        this.eventName = eventName;
        this.additionalInfo = additionalInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
