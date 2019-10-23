package com.jesse.flylove.service.impl;

import com.jesse.flylove.dto.PhotoTexts;
import com.jesse.flylove.mapper.PhotoTextsExtMapper;
import com.jesse.flylove.service.PhotoTextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 11:47 2019/10/23
 **/
@Service
public class PhotoTextServiceImpl implements PhotoTextService {

    @Autowired
    private PhotoTextsExtMapper photoTextsExtMapper;
    @Override
    public PhotoTexts getById(int id) {
        PhotoTexts photoTexts = photoTextsExtMapper.selectById(id);
        return photoTexts;
    }
}
