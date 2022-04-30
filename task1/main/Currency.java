package homework4.task1;

import java.math.BigDecimal;

public enum Currency {
    DOLLAR {
        public BigDecimal getCurse() {
            return BigDecimal.valueOf(2.5030);
        }
    },
    EURO {
        public BigDecimal getCurse() {
            return BigDecimal.valueOf(2.9341);
        }
    },
    RUB_RF {
        public BigDecimal getCurse() {
            return BigDecimal.valueOf(0.0341);
        }
    };

    public abstract BigDecimal getCurse();
}
