package org.abodah.demo.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.abodah.demo.enums.ETypeDoc;
import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "BQ_DOCUMENT")
public class Document extends RepresentationModel<Document> implements Serializable {

	public enum DOCUMENT_STATUS {
		POSTED, APPROVED, REJECTED,
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String fileName;
	private Date insertionDate;
	private ETypeDoc typeDoc;
	private byte[] qrCode;
	
	@Enumerated(value = EnumType.STRING)
	@Column(name = "document_status")
	private DOCUMENT_STATUS status = DOCUMENT_STATUS.POSTED;
	private String description;

	@Lob
	private Blob file;
	
	@ManyToOne(fetch = FetchType.LAZY)
	Occupation ocupation;

	@ManyToOne
	@JoinColumn(name = "uploaded_by_user_id", nullable = false)
	private User uploadedBy;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "approved_by_user_id")
	private User approvedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}

	public ETypeDoc getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(ETypeDoc typeDoc) {
		this.typeDoc = typeDoc;
	}

	public DOCUMENT_STATUS getStatus() {
		return status;
	}

	public void setStatus(DOCUMENT_STATUS status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getFile() {
		return file;
	}

	public void setFile(Blob file) {
		this.file = file;
	}

	public User getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(User uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public User getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(User approvedBy) {
		this.approvedBy = approvedBy;
	}

	public byte[] getQrCode() {
		return qrCode;
	}

	public void setQrCode(byte[] qrCode) {
		this.qrCode = qrCode;
	}

	public Occupation getOcupation() {
		return ocupation;
	}

	public void setOcupation(Occupation ocupation) {
		this.ocupation = ocupation;
	}

}
