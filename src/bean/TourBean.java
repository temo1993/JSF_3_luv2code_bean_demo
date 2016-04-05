package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
@SessionScoped
@ManagedBean
public class TourBean implements Serializable{
    private String kindOfTour;

    public String getKindOfTour() {
        return kindOfTour;
    }

    public void setKindOfTour(String kindOfTour) {
        this.kindOfTour = kindOfTour;
    }

    public TourBean() {
    }

    public String startTheTour(){
        if (kindOfTour != null && "city".equals(kindOfTour)) {
            return "city_tour";
        }else {
            return "country_tour";
        }
    }
}
