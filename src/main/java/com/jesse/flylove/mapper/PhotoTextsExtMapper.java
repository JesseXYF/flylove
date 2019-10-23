package com.jesse.flylove.mapper;

import com.jesse.flylove.dto.PhotoTexts;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 11:38 2019/10/23
 **/
@Repository
public interface PhotoTextsExtMapper {

    @Select({"select id,texts from photo_text where id =#{id}"})
    PhotoTexts selectById(@Param("id")int id);
}
