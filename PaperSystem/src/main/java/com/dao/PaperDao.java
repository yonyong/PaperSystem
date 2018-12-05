package com.dao;

import com.pojo.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();


}