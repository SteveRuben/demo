package org.abodah.demo.repositories;

import org.abodah.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {

	Document getDocumentByCode(String code);

}
