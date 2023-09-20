package com.ba.boost.firstprojectwithspring.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MathAdditionRequest {

    private int number1;

    private int number2;
}
