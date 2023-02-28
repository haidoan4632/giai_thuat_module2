package ss9_dsa_danh_sach.model;

public class HocVien {
    private String code;
    private String name;
    private String date;
    private String gender;
    private String className;
    private String score;

    public HocVien() {
    }

    public HocVien(String code, String name, String date, String gender, String className, String score) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.className = className;
        this.score = score;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
