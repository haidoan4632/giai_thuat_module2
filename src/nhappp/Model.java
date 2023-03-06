package nhappp;

import java.util.Objects;

public class Model {
    private String name;
    private String tuoi;

    public Model() {
    }

    public Model(String name, String tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", tuoi='" + tuoi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return Objects.equals(name, model.name) &&
                Objects.equals(tuoi, model.tuoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tuoi);
    }
}
