package info.sjd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Result implements Cloneable {
    private int index;
    private int value;
    private int maxForThisValue;
    private int maxForThisIndex;
    private int profit;

    public void reset(){
        this.index = 0;
        this.value = 0;
        this.maxForThisIndex = 0;
        this.maxForThisValue = 0;
        this.profit = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return index == result.index &&
                value == result.value &&
                maxForThisValue == result.maxForThisValue &&
                maxForThisIndex == result.maxForThisIndex &&
                profit == result.profit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, value, maxForThisValue, maxForThisIndex, profit);
    }
}
