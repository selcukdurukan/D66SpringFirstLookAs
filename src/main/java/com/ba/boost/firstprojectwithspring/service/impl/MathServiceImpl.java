package com.ba.boost.firstprojectwithspring.service.impl;

import com.ba.boost.firstprojectwithspring.model.dto.request.MathAdditionRequest;
import com.ba.boost.firstprojectwithspring.service.IMathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements IMathService {
    @Override
    public int addition(MathAdditionRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
}
