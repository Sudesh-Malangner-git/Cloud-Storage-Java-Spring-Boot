package com.udacity.jwdnd.course1.cloudstorage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;


	@Mapper
	public interface  NoteMapper {
	   @Select("SELECT * FROM NOTES WHERE noteid = #{id}")
	   Note findNote(int id);
	   
	   @Select("SELECT n.noteid, n.notetitle, n.notedescription, n.userid, u.username AS ownerUsername " +
			   "FROM NOTES n LEFT JOIN USERS u ON n.userid = u.userid ORDER BY n.noteid DESC")
	   List<Note> getNotes();
	   
	   @Select("SELECT * FROM NOTES WHERE userId = #{userid}")
	   List<Note> getNotesByUser(Integer userId);

	   @Insert("INSERT INTO NOTES(notetitle, notedescription, userid) VALUES(#{noteTitle},  #{noteDescription}, #{userId})")
	   @Options(useGeneratedKeys = true, keyProperty = "noteId")
	   Integer insert(Note note);

	   @Delete("DELETE FROM NOTES WHERE noteid = #{id}")
	   void delete(int id);

	   @Delete("DELETE FROM NOTES WHERE userid = #{userId}")
	   void deleteByUserId(Integer userId);
	   
	   @Update("UPDATE NOTES SET noteTitle = #{noteTitle}, notedescription = #{noteDescription} " +
	            "WHERE noteId = #{noteId}")
	   void updateNote(Note note);
	}
