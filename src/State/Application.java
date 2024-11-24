package State;

public class Application {
    public static void main(String[] args) {
        Player player = new Player();
        player.clickPlay();
        player.clickLock();
        player.clickPlay();
        player.clickNext();
        player.clickLock();
        player.clickPlay();
    }
}
