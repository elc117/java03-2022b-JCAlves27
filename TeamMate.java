package Classes;

public class TeamMate {
    // Atributos
    private String Name;
    private String Userid;
    private int Turma;
    private Boolean Online = false;

    // metodo construtor
    public TeamMate() {
        Name = "Julio cesar Alves";
        Userid = "201520513";

    }

    public TeamMate(String name, String userid) {
        this.Name = name;
        this.Userid = userid;
        Turma = 10;

    }

    // Metodo Especificos
    public void mostrarDados() {
        System.out.format("Nome: %s\nUserid: %s\nTurma: %d",
                Name,
                Userid,
                Turma);
    }

    // Parte onde está o Get e set.

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public int getTurma() {
        return Turma;
    }

    public void setTurma(int turma) {
        Turma = turma;
    }

    public Boolean getOnline() {
        return Online;
    }

    public void setOnline(Boolean online) {
        Online = online;
    }

}
