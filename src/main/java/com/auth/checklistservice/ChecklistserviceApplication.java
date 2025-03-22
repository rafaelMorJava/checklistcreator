package com.auth.checklistservice;

import com.auth.checklistservice.checklistcreator.domain.*;
import com.auth.checklistservice.checklistcreator.domain.valueobj.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class ChecklistserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChecklistserviceApplication.class, args);

		Theme theme = Theme.builder()
				.themeId(new ThemeId(UUID.randomUUID()))
				.value("Math")
				.build();

		AnswerType answerType = AnswerType.builder()
				.id(new AnswerTypeId(UUID.randomUUID()))
				.value("multiple choices")
				.build();
		QuestionType questionType = QuestionType.builder()
				.id(new QuestionTypeId(UUID.randomUUID()))
				.value("multiple choices")
				.build();

		Answer answer1 = Answer.builder()
				.id(new AnswerId(UUID.randomUUID()))
				.answerType(answerType.getId())
				.answerAttributes(Collections.singletonMap("value", "answer1"))
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.build();

		Answer answer2 = Answer.builder()
				.id(new AnswerId(UUID.randomUUID()))
				.answerType(answerType.getId())
				.answerAttributes(Collections.singletonMap("value", "answer2"))
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.build();

		Answer answer3 = Answer.builder()
				.id(new AnswerId(UUID.randomUUID()))
				.answerType(answerType.getId())
				.answerAttributes(Collections.singletonMap("value", "answer3"))
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.build();

		Question question = Question.builder()
				.id(new QuestionId(UUID.randomUUID()))
				.questionType(questionType.getId())
				.text("question 1")
				.subText("subtext for question")
				.createdBy(UUID.randomUUID())
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.answers(List.of(answer1.getId(), answer2.getId(), answer3.getId()))
				.build();

		Question question2 = Question.builder()
				.id(new QuestionId(UUID.randomUUID()))
				.questionType(questionType.getId())
				.text("question 2")
				.subText("subtext for question")
				.createdBy(UUID.randomUUID())
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.answers(List.of(answer1.getId(), answer2.getId(), answer3.getId()))
				.build();

		Question question3 = Question.builder()
				.id(new QuestionId(UUID.randomUUID()))
				.questionType(questionType.getId())
				.text("question 3")
				.subText("subtext for question")
				.createdBy(UUID.randomUUID())
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.answers(List.of(answer1.getId(), answer2.getId(), answer3.getId()))
				.build();

		Section section = Section.builder()
				.id(new SectionId(UUID.randomUUID()))
				.theme(theme.getThemeId())
				.questions(List.of(question.getId(), question2.getId(), question3.getId()))
				.build();

		CheckList testCheckList = CheckList.builder()
				.id(new CheckListId(UUID.randomUUID()))
				.text("Test first checklist")
				.subText("Checklist created for test sys")
				.createdBy(UUID.randomUUID())
				.createdAt(Timestamp.from(Instant.now()))
				.lastUpdatedAt(Timestamp.from(Instant.now()))
				.sections(List.of(section.getId()))
				.build();

		System.out.println(testCheckList.toString());
		System.out.println(answer1.toString());
	}

}
