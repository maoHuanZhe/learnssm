package com.fgrapp.learnssm.service;

import com.fgrapp.learnssm.mapper.DictionaryMapper;
import com.fgrapp.learnssm.pojo.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DictionaryService
 *
 * @author FGR on 2019/11/5
 */
@Service
public class DictionaryService {
    private final DictionaryMapper dictionaryMapper;

    @Autowired
    public DictionaryService(DictionaryMapper dictionaryMapper) {
        this.dictionaryMapper = dictionaryMapper;
    }

    /**
     * 获取列表
     * @param dictSetId
     * @return
     */
    public List<Dictionary> getList(int dictSetId){
        return dictionaryMapper.getDictionaryByDictSetID(dictSetId);
    }

    public void save(Dictionary dictionary){
        dictionaryMapper.save(dictionary);
    }

    public void update(Dictionary dictionary){
        dictionaryMapper.update(dictionary);
    }

    public void delete(int id){
        dictionaryMapper.delete(id);
    }

}
