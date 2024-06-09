package com.Child.ChildWelfareJavaProject.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class UserChild {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] childImages;

    private String description;
    private String imgname;
    private String location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getChildImages() {
		return childImages;
	}
	public void setChildImages(byte[] childImages) {
		this.childImages = childImages;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public UserChild(Long id, byte[] childImages, String description, String imgname, String location) {
		super();
		this.id = id;
		this.childImages = childImages;
		this.description = description;
		this.imgname = imgname;
		this.location = location;
	}
	public UserChild() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
    // getters and setters
}
