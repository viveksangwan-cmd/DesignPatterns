package State;

public class UnlockedState implements State{
    private final Player player;

    UnlockedState(Player player){
        this.player = player;
    }
    @Override
    public void clickPlay() {
        System.out.println("Track is playing.");
    }

    @Override
    public void clickNext() {
        System.out.println("Next track is playing.");
    }

    @Override
    public void clickPrevious() {
        System.out.println("Previous track is playing.");
    }

    @Override
    public void clickLock() {
        this.player.changeLockStatus();
        this.player.setState(new LockState(this.player));
        System.out.println("Player is now locked");
    }
}
