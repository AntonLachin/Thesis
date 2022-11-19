package calculations.model;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Materials_and_properties")
public class MaterialsAndProperties {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private int id;
    @Column(name = "CompressiveResistance")
    private double compressiveResistance;
    @Column(name = "StretchingResistance")
    private double stretchingResistance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCompressiveResistance() {
        return compressiveResistance;
    }

    public double getStretchingResistance() {
        return stretchingResistance;
    }

}
