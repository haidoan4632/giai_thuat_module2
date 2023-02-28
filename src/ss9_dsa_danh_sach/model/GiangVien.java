package ss9_dsa_danh_sach.model;

public class GiangVien {
    private String code;
    private String name;
    private String date;
    private String gender;
    private String expertise;

    public GiangVien() {
    }

    public GiangVien(String code, String name, String date, String gender, String expertise) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.expertise = expertise;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "GiangVien{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}
