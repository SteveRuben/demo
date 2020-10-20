package org.abodah.demo.controllers;



import org.abodah.demo.controllers.exception.ResourceNotFoundException;
import org.abodah.demo.model.UserGroup;
import org.abodah.demo.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @CrossOrigin(origins = "http://localhost:3000")

    @GetMapping("/usergroups")
    public List<UserGroup> getAllUserGroups (){

        return groupRepository.findAll();
    }

    @GetMapping("/usergroups/{group_id}")
    public UserGroup getUserGroup (@PathVariable (value = "group_id") Long groupId){
        return groupRepository.findById(groupId)
                .orElseThrow(() -> new ResourceNotFoundException("user_id", "group_id", groupId));
    }



    @PostMapping("/groups")
    public UserGroup createGroup(@Valid @RequestBody UserGroup userGroup) {

        return groupRepository.save(userGroup);
    }

   
}
