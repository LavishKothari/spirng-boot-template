package org.springboottest.com.subject;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public List<Subject> someFunction() {
		return subjectService.getAllSubjects();
	}
	
	@RequestMapping("/subject/{subjectId}")
	public Subject getSubjectById(@PathVariable String subjectId) {
		return subjectService.getSubjectById(subjectId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.getAllSubjects().add(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/subjects")
	public void updateSubject(@RequestBody Subject subject) {
		subjectService.updateSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/subject/{subjectId}")
	public void deleteSubject(@PathVariable String subjectId) {
		subjectService.deleteSubjectById(subjectId);
	}
	
}
