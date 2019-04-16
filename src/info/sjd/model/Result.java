package info.sjd.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
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



}
