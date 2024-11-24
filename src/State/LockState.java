package State;

public class LockState implements State{

    private final Player player;
    LockState(Player player ){
        this.player = player;
    }
    @Override
    public void clickPlay() {
        System.out.println("Player is locked.");
    }

    @Override
    public void clickNext() {
        System.out.println("Player is locked.");

    }

    @Override
    public void clickPrevious() {
        System.out.println("Player is locked.");
    }

    @Override
    public void clickLock() {
        this.player.changeLockStatus();
        this.player.setState(new UnlockedState(this.player));
        System.out.println("Player is unlocked");
    }
}
