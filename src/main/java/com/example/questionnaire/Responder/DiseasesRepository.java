package com.example.questionnaire.Responder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseasesRepository extends JpaRepository<Diseases, Integer> {
}
