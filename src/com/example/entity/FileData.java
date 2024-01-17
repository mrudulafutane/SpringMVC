package com.example.entity;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileData {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String filename;
	 @Lob
	 private  byte[] fileinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getFileinfo() {
		return fileinfo;
	}
	public void setFileinfo(byte[] fileinfo) {
		this.fileinfo = fileinfo;
	}
	@Override
	public String toString() {
		return "FileData [id=" + id + ", filename=" + filename + ", fileinfo=" + Arrays.toString(fileinfo) + "]";
	}
	 
	 
}
