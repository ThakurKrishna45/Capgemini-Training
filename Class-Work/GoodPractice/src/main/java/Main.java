import com.capg.dao.PlayerDAO;
import com.capg.dao.PlayerDAOImpl;
import com.capg.entity.Player;

public class Main {
    public static void main(String[] args) {
        PlayerDAO dao=new PlayerDAOImpl();
//        dao.insertPlayer(new Player(4,"Dhoni","India"));
        System.out.println(dao.getAllPlayers().get(2));
    }
}
