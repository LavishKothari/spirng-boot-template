package org.springboottest.com.subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubjectService {

	List<Subject> subjects = new ArrayList<>(Arrays.asList(
			new Subject("AI","Artificial Intelligence", "Artificial Intelligence description"),
			new Subject("ML","Machine Learning", "Machine Learning description"),
			new Subject("Algo","Algorithms and Complexity", "Algorithms and Complexity description"),
			new Subject("DS","Data Structures", "Data Structures description")
			));
	
	public List<Subject> getAllSubjects(){
		return subjects;
	}
	public Subject getSubjectById(String id) {
		return subjects.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}
	public void updateSubject(Subject subject) {
		for(int i=0;i<subjects.size();i++) {
			if(subjects.get(i).getId().equals(subject.getId())) {
				subjects.set(i, subject);
				return;
			}
		}
	}
	public void deleteSubjectById(String subjectId) {
		subjects.removeIf(s->s.getId().equals(subjectId));
	}
	
}
