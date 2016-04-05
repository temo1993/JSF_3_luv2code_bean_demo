package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

// Default scope if not specified
@RequestScoped
@ManagedBean
public class CounterThree implements Serializable{
    private int value = 0;

    public CounterThree() {
    }

    public String increment(){
        value++;
        return "student_one";
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
