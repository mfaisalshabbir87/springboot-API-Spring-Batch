package com.example.demo.repository;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // No need to write any SQL — JPA handles everything
}


// for jdbc

//@Repository
//public class UserDaoImpl implements UserDao {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Override
//    public List<User> findAll() {
//        return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
//    }
//
//    @Override
//    public User findById(Long id) {
//        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE ID = ?", new UserRowMapper(), id);
//    }
//
//    @Override
//    public void save(User user) {
//        jdbcTemplate.update("INSERT INTO users (ID, NAME) VALUES (?, ?)", user.getId(), user.getName());
//    }
//
//    @Override
//    public void update(User user) {
//        jdbcTemplate.update("UPDATE users SET NAME = ? WHERE ID = ?", user.getName(), user.getId());
//    }
//
//    @Override
//    public void delete(Long id) {
//        jdbcTemplate.update("DELETE FROM users WHERE ID = ?", id);
//    }
//
//    class UserRowMapper implements RowMapper<User> {
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            User user = new User();
//            user.setId(rs.getLong("ID"));
//            user.setName(rs.getString("NAME"));
//            return user;
//        }
//    }
//}