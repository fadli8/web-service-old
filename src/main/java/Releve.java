import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private String RIB;
    @XmlElement
    private Date dateReleve;
    @XmlElement
    private double solde;
    @XmlElement(name = "operations")
    private Operations op;

    public Releve() {
    }

    public Releve(String RIB, Date dateReleve, double solde, Operations op) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.op = op;
    }

    public Operations getOp() {
        return op;
    }

    public void setOp(Operations op) {
        this.op = op;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }


    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "RIB='" + RIB + "\n" +
                ", dateReleve=" + dateReleve+ "\n"  +
                ", solde=" + solde+ "\n"  +
                ", operations=" + op +
                '}';
    }
}
