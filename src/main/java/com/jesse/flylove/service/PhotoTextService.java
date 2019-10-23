package com.jesse.flylove.service;

import com.jesse.flylove.dto.PhotoTexts;
import org.springframework.stereotype.Service;

/**
 * @program: CloudEnglish
 * @description:
 * @author: Jesse
 * @create: 11:46 2019/10/23
 **/
public interface PhotoTextService {

    public PhotoTexts getById(int id);
}
