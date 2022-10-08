import java.util.ArrayList;

public class ListOfTeamMate {

    public static void main(String[] args) {
        String[] Names = { "Claudia", "Fernando", "Cesar", "Joaquin", "Alves" };
        ArrayList<TeamMate> l1 = new ArrayList<TeamMate>();
        boolean online = false;

        for (int i = 0; i < Names.length; i++) {

            if (i % 2 == 0) {
                online = true;
            } else {
                online = false;
            }
            l1.add(new TeamMate(Integer.toString(i), Names[i], online));
        }

        for (TeamMate item : l1) {
            String getonline = "";
            if (item.getOnline()) {
                getonline = "Disponiveis";

            } else {
                getonline = "Indisponiveis";

            }
            System.out.println(item.getName() + " : " + item.getUserid() + " / " + getonline);

        }

    }
}