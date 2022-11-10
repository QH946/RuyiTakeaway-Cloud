package com.qh.ruyi.dto;
import com.qh.ruyi.entity.Setmeal;
import com.qh.ruyi.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
