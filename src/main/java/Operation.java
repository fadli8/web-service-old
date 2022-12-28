import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private String type;
    @XmlAttribute
    private Date date;
    @XmlAttribute
    private double montent;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(String type, Date date, double montent, String description) {
        this.type = type;
        this.date = date;
        this.montent = montent;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontent() {
        return montent;
    }

    public void setMontent(double montent) {
        this.montent = montent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", montent=" + montent +
                ", description='" + description + '\'' +
                '}';
    }
}
