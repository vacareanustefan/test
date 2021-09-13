package com.codacy.test;

import com.codacy.test.Domain.Todo;
import com.codacy.test.Domain.User;
import com.codacy.test.Repository.TodoRepository;
import com.codacy.test.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private TodoRepository todoRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testSave() {
		User user = new User("john");
		userRepository.save(user);
		Todo t1 = new Todo("this is a test", true, user);
		Todo saveTodo = todoRepository.save(t1);

		assertEquals(t1, saveTodo);
	}

	@Test
	public void testUpdate() {
		User user = new User("cris");
		userRepository.save(user);
		Todo todo = new Todo("test3", false, user);
		Todo saveTodo = todoRepository.save(todo);
		saveTodo.setTitle("I made an update");
		Todo updateTodo = todoRepository.save(saveTodo);

		assertEquals("I made an update", updateTodo.getTitle());
	}

	@Test
	public void testFindById() {
		User user = new User("Ben");
		userRepository.save(user);
		Todo todo = new Todo("test find by id", false, user);
		Todo saveTodo = todoRepository.save(todo);
		Optional<Todo> findTodo = todoRepository.findById(saveTodo.getId());

		assertEquals(saveTodo.getTitle(),findTodo.get().getTitle());
	}

}
