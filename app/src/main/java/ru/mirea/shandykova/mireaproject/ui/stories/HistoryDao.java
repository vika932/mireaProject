package ru.mirea.shandykova.mireaproject.ui.stories;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HistoryDao {
    @Query("SELECT * FROM Cell")
    List<ru.mirea.shandykova.mireaproject.ui.stories.Cell> getAll();
    @Query("SELECT * FROM Cell WHERE id = :id")
    ru.mirea.shandykova.mireaproject.ui.stories.Cell getById(long id);
    @Insert
    void insert(ru.mirea.shandykova.mireaproject.ui.stories.Cell cell);
    @Update
    void update(ru.mirea.shandykova.mireaproject.ui.stories.Cell cell);
    @Delete
    void delete(ru.mirea.shandykova.mireaproject.ui.stories.Cell cell);

}
