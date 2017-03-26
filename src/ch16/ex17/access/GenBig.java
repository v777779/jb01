package ch16.ex17.access;

import lib.utils.IGenerator;

import java.math.BigDecimal;

/**
 * Created by V1 on 26.03.2017.
 */
public class GenBig implements IGenerator<BigDecimal> {
    private BigDecimal value = new BigDecimal("0"); // 0 начальное значение
    private BigDecimal step = new BigDecimal("1"); // 0 начальное значение

    public GenBig() {
    }

    public GenBig(BigDecimal step) {
        this.step = step;
    }
    public GenBig(int step) {
        this.step = new BigDecimal(step); // сконвертировать в BigDecimal
    }

    @Override
    public BigDecimal next() {
        value = value.add(step);
        return value;
    }
}
