public class TeamMate {

    // Atributos
    private String Name;
    private String Userid;
    private Boolean online;

    // Construtor

    public TeamMate(String Name, String Userid, boolean online) {
        this.Name = Name;
        this.Userid = Userid;
        this.online = online;
    }

    // Aqui se encontra os Getters e Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        this.Userid = userid;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

}
