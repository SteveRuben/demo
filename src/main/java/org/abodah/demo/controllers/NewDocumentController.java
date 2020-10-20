package org.abodah.demo.controllers;



import org.abodah.demo.config.UserPrincipal;
import org.abodah.demo.controllers.request.PostNewDocumentRequest;
import org.abodah.demo.model.Document;
import org.abodah.demo.model.User;
import org.abodah.demo.repositories.DocumentRepository;
import org.abodah.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/documents")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
public class NewDocumentController {

    @Autowired
    DocumentRepository documentRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public Page<Document> getDocuments(Pageable pageable) {
        return this.documentRepository.findAll(pageable);
    }

    @GetMapping("/{documentNumber}")
    public Document getDocuments(@PathParam("{documentNumber}") String code) {


        return this.documentRepository.getDocumentByCode(code); //
    }

    @PostMapping("/newdocument")
    public Document addNewDocument(@RequestBody PostNewDocumentRequest newDocumentRequest,
                                   @AuthenticationPrincipal UserPrincipal user) {

        User currentUser = userRepository.getOne(user.getId());

        Document postedDocument = new Document();
//        postedDocument.setDocumentNumber(newDocumentRequest.document_number);
     
        currentUser.addUploadedDocument(postedDocument);
        userRepository.save(currentUser);
        documentRepository.save(postedDocument);

        return postedDocument;

    }
}
