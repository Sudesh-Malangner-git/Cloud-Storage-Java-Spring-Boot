package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.SupportReport;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupportMapper {
    @Insert("INSERT INTO SUPPORT(subject, message, userid) VALUES(#{subject}, #{message}, #{userId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Integer insert(SupportReport report);

    @Select("SELECT s.id, s.subject, s.message, s.createdAt, s.userid, u.username " +
            "FROM SUPPORT s LEFT JOIN USERS u ON s.userid = u.userid " +
            "ORDER BY s.createdAt DESC")
    List<SupportReport> getAllReports();

    @Delete("DELETE FROM SUPPORT WHERE id = #{id}")
    void delete(Integer id);

    @Delete("DELETE FROM SUPPORT WHERE userid = #{userId}")
    void deleteByUserId(Integer userId);
}
