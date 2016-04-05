package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@SessionScoped
@ManagedBean
public class CounterOne implements Serializable{
    private int value = 0;

    public CounterOne() {
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
