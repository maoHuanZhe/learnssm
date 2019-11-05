package com.fgrapp.learnssm.mapper;

import com.fgrapp.learnssm.pojo.Dictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * DictionaryMapper
 *
 * @author FGR on 2019/11/5
 */
public interface DictionaryMapper {
    /**
     * 根据字典集编号获取字典列表
     * @param dictSetID 字典集编号
     * @return 字典列表
     */
    List<Dictionary> getDictionaryByDictSetID(@Param("dictSetID") Integer dictSetID);

    /**
     * 新增
     * @param dictionary dictionary
     */
    void save(Dictionary dictionary);

    /**
     * 修改
     * @param dictionary dictionary
     */
    void update(Dictionary dictionary);

    /**
     * 删除
     * @param id id
     */
    void delete(@Param("id") int id);
}
