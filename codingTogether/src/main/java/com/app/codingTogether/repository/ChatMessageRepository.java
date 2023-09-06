package com.app.codingTogether.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.codingTogether.model.ChatMessage;
import com.app.codingTogether.model.Like;
import com.app.codingTogether.model.User;

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
	List<ChatMessage> findTop25ByOrderByTimestampDesc();
	
	  List<ChatMessage> findBySender(User sender);
}
